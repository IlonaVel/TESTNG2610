package HW151;

import org.testng.annotations.DataProvider;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DataProv {
    @DataProvider
    public static Object[][] getCourses(){
        return new Object[][]{
                {"QA", Arrays.asList("QA Manual", "QA Automation", "QA Automation — Python","Сертифікація ISTQB для тестувальників")},
                {"JAVA", Arrays.asList("Java Pro", "Java Enterprise", "Java Basic", "Основи Java для школярів")},
                {"Dev", Arrays.asList("DevOps","Python Pro","PHP")},
                {"Management", Arrays.asList("Product Management","Project Management","Customer Experience Management")},
                {"SMM", Arrays.asList("Social Media Marketing", "SMM Pro", "SMM для школярів")}
        };
    }
}
