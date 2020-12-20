package Day5.MyShopTests;

import Day4.TestBase;
import Day5.MyStore.HomepagePO;
import Day5.MyStore.MenuPO;
import org.testng.annotations.Test;

public class ShopProcessTests extends TestBase {

    @Test
    public void shouldCorrectlyAddMultipleItemsToCartTest(){
        // 3 razy wylosuj produkt i ilosc -> dodaj do koszyka
        // przejdz do koszyka
        // sprawdz wartosc i prawislowosc sumy itemow w koszyku 
        HomepagePO homepagePO = new HomepagePO(driver);
        MenuPO menuPO = new MenuPO(driver);

        homepagePO.openMe();
        int randomNumber;
        double price;
        double Value = 0;

        for (int i=0;i<3;i++){
            //tu dzialajcie
        }
        menuPO.openCart();
        //tu asercje, ile?

    }
}
