package test;

import common.UtilsSetup;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class TCLogin extends BaseTC {
    HomePage home_page;
    LoginPage login_page;

    @Test(priority = 1)
    public void TC1_LoginSuccessfully() throws InterruptedException {
        login_page = new LoginPage(UtilsSetup.getInstance().getDriver());
        login_page.loginToOrangePage("Admin", "admin123");
        home_page = new HomePage(UtilsSetup.getInstance().getDriver());
        Assert.assertEquals(home_page.getTitle(), "OrangeHRM");
        Reporter.getCurrentTestResult();
    }

    @Test(priority = 2)
    public void TC2_LoginFail() {
        login_page = new LoginPage(UtilsSetup.getInstance().getDriver());
        login_page.loginToOrangePage("Admin_fail", "admin123");
        Assert.assertEquals(login_page.getErrMessLoginFail(), "Invalid credentials");
        Reporter.getCurrentTestResult();
    }
}
