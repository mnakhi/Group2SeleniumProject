package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonAPI {
    @FindBy(linkText = "Forgot login info?")
    WebElement forgotLoginLink;

    public void clickOnForgotLogin(){
        forgotLoginLink.click();
    }
}
