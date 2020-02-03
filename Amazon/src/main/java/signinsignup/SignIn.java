package signinsignup;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends CommonAPI {
    @FindBy(id = "nav-link-accountList")
    WebElement signBtn;
    @FindBy(css="span[class='a-button-inner']")
    WebElement signInBtn;
    @FindBy(id="ap_email")
    WebElement emailBtn;
    @FindBy(id="continue")
    WebElement continueBtn;
    @FindBy(css="input[type='password']")
    WebElement passwordBtn;
    @FindBy(id="auth-fpp-link-bottom")
    WebElement forgotBtn;
    public void navigateToAmazon() {
        driver.get("https://www.amazon.com/");
    }
    public void goToSignIn() {
        signBtn.click();
    }
    public void signIn(String name,String password){
        goToSignIn();
        emailBtn.sendKeys(name);
        continueBtn.click();
        passwordBtn.sendKeys(password);
        signInBtn.click();

    }
    public void forgotToSignIn(String name){
        goToSignIn();
        emailBtn.sendKeys(name);
        continueBtn.click();
        forgotBtn.click();
    }
    public void navigateToForgotSignIn(String name){
        goToSignIn();
        emailBtn.sendKeys(name);
        continueBtn.click();
        forgotBtn.click();
        continueBtn.click();

    }
}
