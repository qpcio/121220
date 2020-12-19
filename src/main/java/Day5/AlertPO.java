package Day5;

import org.openqa.selenium.WebDriver;

public class AlertPO extends BasePO {
    //click "delayed alert"
    //wait for allert
    // close alert
    //assert text




    public AlertPO(WebDriver driver) {
        super(driver);
        ownURL = "https://seleniumui.moderntester.pl/alerts.php";
    }
}
