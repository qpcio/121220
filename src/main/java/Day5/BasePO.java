package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public abstract class BasePO {
    protected WebDriver driver;
    protected String ownURL;

    public void openMe() {
        driver.get(ownURL);
    }

    public BasePO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    protected WebElement getRandomElement(List<WebElement> elemnts){
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(elemnts.size() - 1);
        return elemnts.get(randomNumber);
    }

    protected int getRandomNumber(int max){
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(max)+1;
        return randomNumber;
    }

    protected void veryBadSleep() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
