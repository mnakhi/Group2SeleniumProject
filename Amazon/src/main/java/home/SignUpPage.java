package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;

public class SignUpPage extends CommonAPI {
    @FindBy(id = "nav-link-accountList")
    WebElement signInBtn;
    @FindBy(linkText = "Start here.")
    WebElement signInLink;
    @FindBy(id="ap_customer_name")
    WebElement userNameBox;
    @FindBy(id="ap_email")
    WebElement emailBox;
    @FindBy(id="ap_password")
    WebElement passwordBox;
    @FindBy(id="ap_password_check")
    WebElement reenterPasswordBox;
    @FindBy(id="continue")
    WebElement createAccountBtn;
    public void canGoToSignUpPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(signInLink).perform();
        actions.click().build().perform();
    }
    public void createAccount(String name, String email,String password){
        canGoToSignUpPage();
        userNameBox.sendKeys(name);
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        reenterPasswordBox.sendKeys(password);
        createAccountBtn.click();
    }


}
