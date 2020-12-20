package Day5.MyStore;

import Day5.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class QuickViewPO extends BasePO {
    @FindBy(css = "h1.h1")
    private WebElement title;

    @FindBy(name = "qty")
    private WebElement quantity;

    @FindBy(css = ".add-to-cart")
    private WebElement addToCartButton;

    @FindBy(css = ".cart-content-btn a")
    private WebElement addedToCartProceedButton;

    public void addToCart() {
        addToCartButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(addedToCartProceedButton));
    }

    public void setQuantity(int n) {
        quantity.clear();
        quantity.sendKeys(Integer.toString(n));
    }

    public String getTitle() {
        return title.getText();
    }

    public QuickViewPO(WebDriver driver) {
        super(driver);
    }
}
