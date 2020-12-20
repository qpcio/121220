package Day5.MyStore;

import Day5.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductAddedToCartPO extends BasePO {
    @FindBy(css = ".cart-content-btn a")
    private WebElement ProceedButton;

    @FindBy(css = ".cart-content [data-dismiss]")
    private WebElement continueShopingButton;

    @FindBy(css = "#blockcart-modal")
    private WebElement blockingModal;


    public void clickContinueShoping(){
        continueShopingButton.click();
        wait.until(ExpectedConditions.invisibilityOf(blockingModal));
    }

    public void clickProceed() {
        ProceedButton.click();
    }

    public ProductAddedToCartPO(WebDriver driver) {
        super(driver);
    }
}
