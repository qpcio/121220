package Day5;

import Day4.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstPOTests extends TestBase {
    @Test
    public void firstTest() {
        //given
        FormPO formPO = new FormPO(driver);
        formPO.openMe();
        //when
        formPO.fillName("Bogdan", "Wiadro");
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
        Assert.assertEquals(formPO.getValidatorMessageText(), "Form send with success");
    }

    @Test
    public void alternativeTest() {
        FormAlternativePO formAlternativePO = new FormAlternativePO(driver);
        formAlternativePO.openMe();
//        Assert.assertEquals(
//                formAlternativePO
//                        .fillName("Bogdan", "Wiadro")
//                        .fillEmail("test@test.com")
//                        .selectMale()
//                        .fillAge(45)
//                        .selectRandomExperience()
//                        .selectManualTester()
//                        .selectRandomContinent()
//                        .selectRandomCommand()
//                        .fillFileInput()
//                        .fillAdditionalInformation("Tralalala")
//                        .submit()
//                        .getValidatorMessageText(),
//                "Form send with success");


                formAlternativePO
                        .fillName("Bogdan", "Wiadro")
                        .fillEmail("test@test.com")
                        .selectMale()
                        .fillAge(45)
                        .selectRandomExperience()
                        .selectManualTester()
                        .selectRandomContinent()
                        .selectRandomCommand()
                        .fillFileInput()
                        .fillAdditionalInformation("Tralalala")
                        .submit()
                        .getValidatorMessageText();

                Assert.assertEquals(formAlternativePO.getValidatorMessageText(),"Form send with success");


    }

    @Test
    public void progressBarTest() {
        ProgressBarPO progressBarPO = new ProgressBarPO(driver);
        progressBarPO.openMe();
        Assert.assertTrue(progressBarPO.progressBarIsComplete());
    }

    @Test
    public void testDelayedAlert() {
        AlertPO alertPO = new AlertPO(driver);
        alertPO.openMe();
        alertPO.clickDelayedAlertButton();
        alertPO.waitForAlertAndAccept();
        Assert.assertEquals(alertPO.getDelayedAlertLabelText(), "OK button pressed");
    }
}
