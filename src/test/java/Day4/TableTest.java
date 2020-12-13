package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Day4.Mountain;

import java.util.List;

public class TableTest extends TestBase{

    @BeforeMethod
    public void openTable(){
        driver.get("https://seleniumui.moderntester.pl/table.php");
    }

    @Test
    public void tableTest(){
        List<WebElement> mountainRows = driver.findElements(By.cssSelector("tbody>tr"));
        List<Mountain> mountains



    }
}
