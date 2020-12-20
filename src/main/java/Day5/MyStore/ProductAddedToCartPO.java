package Day5.MyStore;

import Day5.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductAddedToCartPO extends BasePO {
    @FindBy(css = ".cart-content-btn a")
    private WebElement ProceedButton;

    public void clickProceed() {
        ProceedButton.click();
    }

    public ProductAddedToCartPO(WebDriver driver) {
        super(driver);
    }
}
