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

    public void canGoToSignUpPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(signInLink).perform();
        actions.click().build().perform();
    }

}
