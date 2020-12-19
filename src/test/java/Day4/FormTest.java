package Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;
import java.util.Random;

public class FormTest extends TestBase{




    @Test
    public void formTest() {
        driver.get("https://seleniumui.moderntester.pl/form.php");


//        WebElement firstName = driver.findElement(By.cssSelector("#inputFirstName3"));
//        firstName.sendKeys("Jan");
        driver.findElement(By.cssSelector("#inputFirstName3")).sendKeys("Jan");

        WebElement lastName = driver.findElement(By.cssSelector("input#inputLastName3"));
        lastName.sendKeys("Kowalski");

        WebElement email = driver.findElement(By.cssSelector("input#inputEmail3"));
        email.sendKeys("jan@kowalski.pl");

        WebElement male = driver.findElement(By.cssSelector("input[value='male']"));
        male.click();

        WebElement age = driver.findElement(By.cssSelector("#inputAge3"));
        age.sendKeys("15");

        List<WebElement> yearsOfExpirience = driver.findElements(By.name("gridRadiosExperience"));
        getRandomElement(yearsOfExpirience).click();

        WebElement manualTester = driver.findElement(By.id("gridCheckManulTester"));
        manualTester.click();

        //continents
        WebElement continentsElements = driver.findElement(By.id("selectContinents"));
        Select continents = new Select(continentsElements);
        List<WebElement> continentsOptions = continents.getOptions();
        continentsOptions.remove(0);
        WebElement randomOption = getRandomElement(continentsOptions);
        continents.selectByVisibleText(randomOption.getText());

        //commands
        WebElement commandsElement = driver.findElement(By.id("selectSeleniumCommands"));
        Select commandsSelect = new Select(commandsElement);
        //commandsSelect.selectByValue("browser-commands");
        List<WebElement> commandsOptions = commandsSelect.getOptions();
        int howManyOption = getRandomNumber(commandsOptions.size());
        for (int i = 0; i < howManyOption; i++) {
            commandsSelect.selectByIndex(i);
        }

        //FileUpload
        WebElement fileInput = driver.findElement(By.id("chooseFile"));
        File file = new File("src/main/resources/emptyFile.txt");
        fileInput.sendKeys(file.getAbsolutePath());

        //AdditionalInformation
        WebElement additionalInfo = driver.findElement(By.cssSelector("#additionalInformations"));
        additionalInfo.sendKeys("Test");

        WebElement signIn = driver.findElement(By.cssSelector("button[type='submit']"));
        signIn.click();

        String validationMessage = driver.findElement(By.id("validator-message")).getText();
        Assert.assertEquals(validationMessage,"Form send with success");

    }


}
