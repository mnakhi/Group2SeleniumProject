package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.WeakHashMap;

public class MoreOnSignIn extends CommonAPI {
    @FindBy(id = "nav-link-accountList")
    WebElement signInBtn;
    @FindBy (linkText = "Create a List")
    WebElement listBtn;
    @FindBy (linkText = "Find a Gift")
    WebElement findGiftBtn;
    public void selectCreateAListFromMouseHover() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(listBtn).perform();
        actions.click().build().perform();
    }
    public void selectFindGiftFromMouseHover() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(findGiftBtn).perform();
        actions.click().build().perform();
    }
}
