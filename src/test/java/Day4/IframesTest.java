package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframesTest extends TestBase {
    @BeforeMethod
    public void openIframesPage() {
        driver.get("https://seleniumui.moderntester.pl/iframes.php");
    }

    @Test
    public void iframeTest() {
        //1st iFrame
        driver.switchTo().frame("iframe1");
        driver.findElement(By.id("inputFirstName3")).sendKeys("Jan");
        driver.findElement(By.id("inputSurname3")).sendKeys("Kowalski");

        //2nd iFrame
        driver.switchTo().defaultContent();
        driver.switchTo().frame("iframe2");

        driver.findElement(By.id("inputLogin")).sendKeys("test@gmail.com");
        driver.findElement(By.id("inputPassword")).sendKeys("secret");

        Select selectContinents = new Select(driver.findElement(By.id("inlineFormCustomSelectPref")));
        selectContinents.selectByVisibleText("Europe");

        WebElement radioExpirience = driver.findElement(By.id("gridRadios7"));
        radioExpirience.click();


    }
}
