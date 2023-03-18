package HWTestNG14;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CertikPage {
        @FindBy(xpath = "//input[@name='certificate']")
        WebElement certificate;
        @FindBy(xpath = "//button[contains(@class,\"certificate-check_submit\")]")
        WebElement buttoncert;


        public void certikForm(String certificate) {
            this.certificate.sendKeys(certificate);
            buttoncert.click();
        }
    }

