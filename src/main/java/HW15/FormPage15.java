package HW15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pageObjects.CourseNames;
import pageObjects.Massengers;
import pageObjects.User;

import java.util.List;

public class FormPage15 {
    @FindBy(xpath="//button[@class='site-nav-link' and contains (text(), 'Курси')]")
    WebElement buttoncourse;
    @FindBy(xpath="//div[contains(@class, 'search-field') and contains(@id, 'coursesMenuSearchField' )]")
    WebElement searchcourse;

    @FindBy(xpath="//button[contains(@class, 'cats-list_btn -recommendation -active')]")
    WebElement reccomend;
    WebDriver driver;

    public FormPage15(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getcourse() {
        return buttoncourse.getText();
    }

    public void putCourseName15(CourseNames15 courseNames15) {
        reccomend.sendKeys(Keys.PAGE_UP);
        searchcourse.sendKeys(Keys.ENTER);
        searchcourse.sendKeys(courseNames15.getCourseName());
    }



}
