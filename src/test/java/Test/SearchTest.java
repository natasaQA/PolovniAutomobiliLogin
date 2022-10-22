package Test;

import Base.BaseTest;
import org.bouncycastle.pqc.crypto.newhope.NHOtherInfoGenerator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {
    @BeforeMethod
    public void homePageSetUp(){
        driver.manage().window().maximize();
        driver.navigate().to("https://www.polovniautomobili.com/");
    }
    @Test
    public void searchCarModel(){


    }
}
