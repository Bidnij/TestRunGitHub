package ComplyCloudWebTest;

import CoplycloudWeb.untils.BrowserFactory;
import CoplycloudWeb.untils.Waiters;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private static WebDriver driver;

    @BeforeSuite
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver");
        System.setProperty("webdriver.safari.driver", "src/test/resources/drivers/safaridriver");

        driver = BrowserFactory.getDriver(BrowserFactory.CHROME);


        if (driver == null) {
            System.out.println("Invalid driver");
            return;
        }


        driver.manage().window().maximize();
        Waiters.implicitWait(driver, Waiters.TIME_TEN, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
