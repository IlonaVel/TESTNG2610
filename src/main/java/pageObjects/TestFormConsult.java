package pageObjects;

import configuretions.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

import static pageObjects.DataProvaderUsers.usersList;

public class TestFormConsult extends BaseClass {
    @DataProvider
    public Object[][] getUsers(){
        List<User> usersList=DataProvaderUsers.getUsersList();
        Object[][] obj = new Object[usersList.size()][1];
        for (int i = 0; i < usersList.size(); i++) obj[i][0] = usersList.get(i);
        return obj;
    }
//    @BeforeSuite
//    public void beSuit(){
//    }
    @BeforeMethod
    public void  before(){
        driver.get("https://dnipro.ithillel.ua/");
        driver.findElement(By.id("btn-consultation-hero")).click();
    }
    @Test(dataProvider = "getUsers")
    public void testform(User user){
        FormPage formPage = PageFactory.initElements(driver, FormPage.class);
        formPage.sentForm(user, Massengers.TELEGRAM, CourseNames.FRONTENDBASIC, true);
        Assert.assertTrue(formPage.isButtonConfirmEnabled());
    }
}
