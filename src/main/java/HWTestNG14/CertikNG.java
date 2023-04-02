package HWTestNG14;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ResourceBundle;

public class CertikNG extends BaseCertik {

    public CertikNG(Certikenam certs) {
        if (bundle1 == null || !bundle1.getString("type1").equals(certs.getType1())) {
            driver.get("https://certificate.ithillel.ua/");
            bundle1 = ResourceBundle.getBundle(certs.getType1());
            certikPage = PageFactory.initElements(driver, CertikPage.class);
        }
    }

    @Test (dataProvider ="getCertic",  dataProviderClass =Certicdata.class)
    public void datacert() throws InterruptedException {
        certikPage.certikForm(bundle1.getString("certificate"));
        Thread.sleep(2000);
        String actual = String.valueOf(driver.getCurrentUrl().contains("view"));
        String expected = bundle1.getString("bol");
        Assert.assertEquals(expected, actual);
    }
}
