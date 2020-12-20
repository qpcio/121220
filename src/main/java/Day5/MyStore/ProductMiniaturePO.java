package Day5.MyStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;

public class ProductMiniaturePO {
    public ProductMiniaturePO(WebElement productMiniature){
        PageFactory.initElements(new DefaultElementLocatorFactory(productMiniature),this);
    }


    //dodac pola i dzialania na takim product miniature
}
