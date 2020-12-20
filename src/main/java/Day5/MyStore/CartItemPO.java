package Day5.MyStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class CartItemPO {
    @FindBy(css = "a.label")
    private WebElement name;

    public String getName() {
        return name.getText();
    }

    public CartItemPO(WebElement productMiniature) {
        PageFactory.initElements(new DefaultElementLocatorFactory(productMiniature), this);
    }
}
