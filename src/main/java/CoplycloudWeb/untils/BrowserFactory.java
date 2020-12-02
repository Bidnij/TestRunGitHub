package CoplycloudWeb.untils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
    public static final String FIREFOX = "FIREFOX";
    public static final String CHROME = "CHROME";
    public static final String CHROMEWEB = "CHROMEWEB";
    public static final String SAFARI = "SAFARI";
    //public static final WebDriver DEFAULT_CHROME = new ChromeDriver();

    public static WebDriver getDriver (String nameDriver) {
        //WebDriver driver = null;

        switch (nameDriver) {
            case FIREFOX:
                return new FirefoxDriver();
            case CHROME:
                return new ChromeDriver();
            case SAFARI:
                return new SafariDriver();
            default:
                return null;
        }
    }
}
