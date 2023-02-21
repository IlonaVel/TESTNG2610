package Config;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    static public WebDriver driver;
    @BeforeClass
    public static void starT() {
        driver = DriverConfig.createDriver(Browsers.CHROME);
    }
    @AfterClass
    public static void enD() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
