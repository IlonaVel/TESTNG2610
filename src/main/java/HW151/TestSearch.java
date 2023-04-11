package HW151;


import configuretions.BaseClass;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class TestSearch  extends BaseClass {
    HillelMainPage hillelMainPage;
    @BeforeClass
    public void b(){
        driver.get("https://dnipro.ithillel.ua/");
        hillelMainPage=new HillelMainPage(driver);
    }

    @Test(dataProvider = "getCourses",dataProviderClass = DataProv.class)
    public void t(String item, List<String> expected){
        List<String> actual=hillelMainPage.getCourseList(item);
        Assert.assertEquals(expected,actual);
    }

}
