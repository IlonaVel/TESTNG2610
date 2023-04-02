package HW15;

import org.testng.annotations.DataProvider;

import java.util.Arrays;

public class Datacourse {
//    @DataProvider
//    public static Object[][] getCourseName(){
//        Object[][] objects = {
//                {"Front-end Basic"},
//                {"Java Pro"},
//                {"qa"},
//                {"python"},
//                {"c#"}
//        };
//        return objects;
//    }

    @DataProvider
    public static Object[][] getCourseName(){
        return new Object[][]{
                {"Front-end Basic", Arrays.asList("Front-end Basic") },
                {"Java Pro", Arrays.asList("Java Pro", "Front-end Pro", "QA Automation", "Основи Front-end для школярів") },
                {"qa", Arrays.asList("QA Manual","QA Automation","QA Automation — Python","Сертифікація ISTQB для тестувальників")},
                {"python", Arrays.asList("Python Basic", "Python Pro","QA Automation — Python", "Основи Python для школярів") },
                {"c#", Arrays.asList("C# Pro", "C# Basic", "Сертифікація ISTQB для тестувальників","SMM для школярів") },
        };
    }
}
