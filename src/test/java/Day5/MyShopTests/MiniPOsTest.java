package Day5.MyShopTests;

import Day4.TestBase;
import Day5.MyStore.HomepagePO;
import org.testng.annotations.Test;

public class MiniPOsTest extends TestBase {
    @Test
    public void allPricesCanBeGetFromPOsTest(){
        HomepagePO homepagePO = new HomepagePO(driver);
        homepagePO.openMe();
        homepagePO.printAllPrices();
    }



    //kliknij w ktorys MiniaturePO-quickview na stronie glownej (sprawdz czy nazwa na stronie glownej
    // jest taka sama jak nazwa w quickView layer
    // * kliknij w randomowy element - za kazdym uruchomieniem testu w inny :)
}
