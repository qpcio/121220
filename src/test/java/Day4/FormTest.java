package Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormTest {


    @Test
    public void formTest() {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-extensions");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://seleniumui.moderntester.pl/form.php");
    }
}
