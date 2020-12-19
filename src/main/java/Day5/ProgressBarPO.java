package Day5;

import org.openqa.selenium.WebDriver;

public class ProgressBarPO extends BasePO{
    //wypelnienie PO
    //zrobienie metody, ktora czeka na wypelnienie progress Baru



    public ProgressBarPO(WebDriver driver) {
        super(driver);
        ownURL = "https://seleniumui.moderntester.pl/progressbar.php";
    }
}
