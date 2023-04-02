package HW15;

import configuretions.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.*;

import java.util.List;

public class TestCourse15 extends BaseClass {
//    @DataProvider
//    public Object[][] getUsers(){
//        List<User> usersList= DataProvaderUsers.getUsersList();
//        Object[][] obj = new Object[usersList.size()][1];
//        for (int i = 0; i < usersList.size(); i++) obj[i][0] = usersList.get(i);
//        return obj;
//    }
//    @BeforeSuite
//    public void beSuit(){
//    }


    @Test
    public void test1() {
        FormPage15 formPage15 = PageFactory.initElements(driver, FormPage15.class);
        driver.get("https://ithillel.ua/");
        formPage15.getcourse();
        formPage15.buttoncourse.click();
    }

    @Test(dataProvider = "getCoursename", dataProviderClass = DataProvider.class, dependsOnMethods = {"test1"}, alwaysRun = true, groups = {"@First"}, priority = 1)
    public void test2(String item, List<String> expected) {
        FormPage15 formPage15 = PageFactory.initElements(driver, FormPage15.class);
        formPage15.putCourseName15(CourseNames15.QA);
        //Assert.assertTrue(formPage15.getcourse(), );
    }
}

//    public class TestSearch  extends BaseClass {
//        HillelMainPage hillelMainPage;
//        @BeforeClass
//        public void b(){
//            driver.get("https://dnipro.ithillel.ua/");
//            hillelMainPage=new HillelMainPage(driver);


//        @Test(dataProvider = "getCourses",dataProviderClass = DataProv.class)
//        public void t(String item, List<String> expected){
//            List<String> actual=hillelMainPage.getCourseList(item);
//            Assert.assertEquals(expected,actual);





