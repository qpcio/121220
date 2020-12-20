package Day5.MyStore;

import Day5.BasePO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomepagePO extends BasePO {
    @FindBy(css = ".product-miniature")
    private List<WebElement> allProductMiniatures;



    //metoda do wypisywania cen z wszystkich produktow
    public void printAllPrices(){
        List<ProductMiniaturePO> allMiniatures = getProductMiniatures();
        for (ProductMiniaturePO pm:allMiniatures) {
            System.out.println(pm.getProductPrice());
        }
    }
    

    private List<ProductMiniaturePO> getProductMiniatures(){
           List<ProductMiniaturePO> miniatures = new ArrayList<>();
        for (WebElement e:allProductMiniatures) {
            miniatures.add(new ProductMiniaturePO(e,driver));
        }
        return miniatures;
    }

    public HomepagePO(WebDriver driver) {
        super(driver);
        ownURL = "http://5.196.7.235/";
    }
}
