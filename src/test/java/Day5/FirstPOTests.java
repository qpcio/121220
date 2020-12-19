package Day5;

import Day4.TestBase;
import org.testng.annotations.Test;

public class FirstPOTests extends TestBase {
    @Test
    public void firstTest(){
        FormPO formPO = new FormPO(driver);
        formPO.openMe();
        formPO.fillName("Bogdan","Wiadro");
        formPO.fillEmail("test@test.com");

    }
}
