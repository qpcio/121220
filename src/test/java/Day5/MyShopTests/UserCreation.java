package Day5.MyShopTests;

import Day4.TestBase;
import Day5.MyStore.CreateAccountPO;
import Day5.MyStore.HomepagePO;
import Day5.MyStore.LoginPO;
import Day5.MyStore.MenuPO;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserCreation extends TestBase {

    @Test
    public void testUserRegistration(){
        //given
        String firstName = "Bogdan";
        String lastname = "Wiadro";
        String email = "test"+System.currentTimeMillis()+"@test.com";
        HomepagePO homepagePO = new HomepagePO(driver);
        homepagePO.openMe();
        MenuPO menuPO = new MenuPO(driver);
        //when
        menuPO.clickSignInOutButton();
        LoginPO loginPO = new LoginPO(driver);
        loginPO.clickCreateAccountLink();
        CreateAccountPO createAccountPO = new CreateAccountPO(driver);
        createAccountPO.fillFormAndSubmit(true,
                firstName,
                lastname,
                email,
                "AAAABBBB",
                "05/08/2000");
        //then
        Assert.assertTrue(menuPO.logoutVisible());
        Assert.assertEquals(menuPO.getUserName(),firstName+" "+lastname);
    }


}
