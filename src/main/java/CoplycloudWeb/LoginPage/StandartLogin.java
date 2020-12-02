package CoplycloudWeb.LoginPage;

import CoplycloudWeb.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StandartLogin extends BasePage {
    public StandartLogin(WebDriver driver) { super(driver); }
    @FindBy (id = "username")
    WebElement usernameField;
    @FindBy (id = "submit")
    WebElement loginButton;

    public WebElement getUsernameField() {
        return usernameField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
