package Day5.MyStore;

import Day5.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickViewPO extends BasePO {
    @FindBy(css = "h1.h1")
    private WebElement title;

    public String getTitle(){
        return title.getText();
    }

    public QuickViewPO(WebDriver driver) {
        super(driver);
    }
}
