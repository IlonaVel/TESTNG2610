package HWTestNG14;

import org.testng.annotations.DataProvider;

public class Certicdata {
    @DataProvider
    public static Object[][] getCertic(){
        Object[][] objects = {
                {"valid1", true},
                {"novalid1", false},
                {"liter", false},
                {"figure", false}};
        return objects;
    }

}
