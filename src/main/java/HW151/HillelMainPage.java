package HW151;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class HillelMainPage {

    @FindBy(id = "btn-consultation-hero")
    public static WebElement element;
    @FindBy(xpath = "//button[@data-dropdown-trigger=\"coursesMenu\"]")
    WebElement courseButton;
    @FindBy(id = "coursesMenuSearchField")
    WebElement searchFieldCourse;
    @FindBy(xpath = "//input[@class=\"search-field_input\"]")
    WebElement search;
    @FindBy(xpath = "//*[@id=\"coursesMenuSearchPanel\"]//p[@class=\"course-label_name\"]")
    List<WebElement> webElementList;

    public HillelMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickConsultButton() {
        element.click();
    }

    public List<String> getCourseList(String item) {
        courseButton.click();
        searchFieldCourse.click();
        search.sendKeys(item);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> stringList = new ArrayList<>();
        for (WebElement l : webElementList) {
            stringList.add(l.getText());
        }
        return stringList;
    }
}
