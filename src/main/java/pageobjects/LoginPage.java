package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;

        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    //1. web elements locator
    @FindBy(how = How.XPATH, using = "//*[@id=\"divLogo\"]")
    WebElement img_logo;

    @FindBy(how = How.ID, using = "txtUsername")
    WebElement txtUsername;

    @FindBy(how = How.ID, using = "txtPassword")
    WebElement txtPassword;

    @FindBy(how = How.ID, using = "btnLogin")
    WebElement btnLogin;

    @FindBy(how = How.ID, using = "spanMessage")
    WebElement errmsg_loginfail;


    //2. method
    //set username
    public void setUserName(String userName){
        txtUsername.sendKeys(userName);
    }

    //Set password in password textbox
    public void setPassword(String password){
        txtPassword.sendKeys(password);
    }

    //Click on login button
    public void clickLogin(){
        btnLogin.click();
    }

    //Login to web
    public void loginToOrangePage(String strUserName,String strPasword){

        //Fill user name
        this.setUserName(strUserName);

        //Fill password
        this.setPassword(strPasword);

        //Click Login button
        this.clickLogin();
    }
    public String getErrMessLoginFail(){
        return errmsg_loginfail.getText();
    }

}
