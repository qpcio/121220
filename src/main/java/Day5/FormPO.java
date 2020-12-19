package Day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FormPO {
    WebDriver driver;
    String ownURL = "https://seleniumui.moderntester.pl/form.php";

    @FindBy(id = "inputFirstName3")
    private WebElement inputFirstName;

    @FindBy(id = "inputLastName3")
    private WebElement inputLastName;

    @FindBy(css = "#inputEmail3")
    private WebElement inputEmail;

    @FindBy(name = "gridRadiosExperience")
    private List<WebElement> yearsOfExperience;


    public void fillName(String firstname, String lastName){
        inputFirstName.sendKeys(firstname);
        inputLastName.sendKeys(lastName);
    }

    public void fillEmail(String email){
        inputEmail.sendKeys(email);
    }

    public void openMe() {
        driver.get(ownURL);
    }




    public FormPO(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
