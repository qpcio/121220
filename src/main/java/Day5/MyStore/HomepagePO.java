package Day5.MyStore;

import Day5.BasePO;
import org.openqa.selenium.WebDriver;

public class HomepagePO extends BasePO {

    public HomepagePO(WebDriver driver) {
        super(driver);
        ownURL = "http://5.196.7.235/";
    }
}
