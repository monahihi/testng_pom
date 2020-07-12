package common;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilsSetup {

    private WebDriver driver;
    String url = "https://opensource-demo.orangehrmlive.com/";

    private static UtilsSetup instance = new UtilsSetup();
    public static UtilsSetup getInstance() {
        return instance;
    }

    private UtilsSetup() {
    }

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void tearDown() {
        driver.quit();
    }
}
