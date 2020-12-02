package ComplyCloudWebTest.LoginPageTest;

import ComplyCloudWebTest.BaseTest;
import CoplycloudWeb.LoginPage.StandartLogin;
import CoplycloudWeb.untils.Waiters;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StandartLoginTest extends BaseTest {

    @Test
    public void EmptyFields() {
        StandartLogin standartLogin = new StandartLogin(getDriver());
        standartLogin.openPage("login");
        Waiters.treadWaiter(2);
        standartLogin.getUsernameField().sendKeys("");
        standartLogin.getLoginButton().click();
        Assert.assertEquals(getDriver().getCurrentUrl(), "sdfsdf");
    }
}
