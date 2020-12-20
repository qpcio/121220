package Day5.MyShopTests;

import Day4.TestBase;
import Day5.MyStore.HomepagePO;
import Day5.MyStore.QuickViewPO;
import org.testng.Assert;
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

    @Test
    public void nameInQuickViewShouldBeTheSameAsOnTheMiniatureTest(){
        HomepagePO homepagePO = new HomepagePO(driver);
        homepagePO.openMe();
        int n = getRandomNumber(homepagePO.miniaturesNumber() - 1 );
        String name1 = homepagePO.getNameOfNthMiniature(n);
        homepagePO.openQuickViewOfNthMiniature(n);
        QuickViewPO quickViewPO = new QuickViewPO(driver);
        Assert.assertEquals(name1,quickViewPO.getTitle());

    }

    @Test
    public void itemsInTheCartShouldHaveCorrectSummaryPrice(){
        // random element z homepage
        //quickview
        // losowa liczba (1-10)
        //dodac do koszyka
        //przejsc do koszyka
        //sprawdzic nazwe i sumaryczna cene w koszyku 
    }


}
