package test;

import common.UtilsSetup;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTC {
    @BeforeMethod
    void beforeTest(){
        UtilsSetup.getInstance().setup();
    }

    @AfterMethod
    void afterTest(){
        UtilsSetup.getInstance().tearDown();
    }
}
