package Day5;

import Day4.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstPOTests extends TestBase {
    @Test
    public void firstTest(){
        //given
        FormPO formPO = new FormPO(driver);
        formPO.openMe();
        //when
        formPO.fillName("Bogdan","Wiadro");
        formPO.fillEmail("test@test.com");
        formPO.selectMale();
        formPO.fillAge(45);
        formPO.selectRandomExperience();
        formPO.selectManualTester();
        formPO.selectRandomContinent();
        formPO.selectRandomCommand();
        formPO.fillFileInput();
        formPO.fillAdditionalInformation("Tralalala");
        formPO.submit();
        //then
        Assert.assertEquals(formPO.getValidatorMessageText(),"Form send with success");
    }
}
