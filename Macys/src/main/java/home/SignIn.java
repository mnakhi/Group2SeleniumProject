package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class SignIn extends CommonAPI {
        @FindBy(id = "nav-link-accountList")
        WebElement signInBtn;
        @FindBy(linkText = "Start here.")
        WebElement signInLink;
        @FindBy (linkText = "Create a List")
        WebElement listlink;
        @FindBy (linkText = "Find a Gift")
        WebElement findGiftlink;
        @FindBy(linkText = "Explore Idea Lists")
        WebElement ideaListLink;
        @FindBy(linkText = "Discover")
        WebElement discoverLink;
        @FindBy(linkText = "Your Orders")
        WebElement ordersLink;
        public void selectCreateAListFromMouseHover() {
            Actions actions = new Actions(driver);
            actions.moveToElement(signInBtn).perform();
            actions.moveToElement(listlink).perform();
            actions.click().build().perform();
        }
        public void selectFindGiftFromMouseHover() {
            Actions actions = new Actions(driver);
            actions.moveToElement(signInBtn).perform();
            actions.moveToElement(findGiftlink).perform();
            actions.click().build().perform();
        }
        public void selectIdeaListFromMouseHover() {
            Actions actions = new Actions(driver);
            actions.moveToElement(signInBtn).perform();
            actions.moveToElement(ideaListLink).perform();
            actions.click().build().perform();
        }
        public void canSignUpFromMouseHover() {
            Actions actions = new Actions(driver);
            actions.moveToElement(signInBtn).perform();
            actions.moveToElement(signInLink).perform();
            actions.click().build().perform();
        }
        public void canDiscoverOptionsFromMouseHover() {
            Actions actions = new Actions(driver);
            actions.moveToElement(signInBtn).perform();
            actions.moveToElement(discoverLink).perform();
            actions.click().build().perform();
        }
        public void cancheckOrderListOptionsFromMouseHover() {
            Actions actions = new Actions(driver);
            actions.moveToElement(signInBtn).perform();
            actions.moveToElement(ordersLink).perform();
            actions.click().build().perform();
        }



//    public void signIn(String name,String password){
//        goToSignIn();
//        emailBtn.sendKeys(name);
//        continueBtn.click();
//        passwordBtn.sendKeys(password);
//        signInBtn.click();
//
//    }
}
