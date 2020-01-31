package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

//write methods
public class HomePage extends CommonAPI {
    @FindBy(id = "globalSearchInputField")
    WebElement searchBox;
    @FindBy(id = "searchSubmit")
    WebElement searchSubmitBtn;
    @FindBy(id = "unselectedMenuButton")
    WebElement shopByDepartment;


    public void navigateToMacys() {
        driver.get("https://www.macys.com");
    }

    public void searchNClick(String itemName) {
        this.navigateToMacys();
        searchBox.sendKeys("Boots");
        searchSubmitBtn.click();
    }

    public void clickingOnDropdown() {
        shopByDepartment.click();
    }


    public void clickingOnSpecificDepartment(String department) {
        driver.findElement(By.id("shopByDepartmentDropdown")).click();
        driver.findElement(By.linkText(department)).click();
    }


//        public void clickingOnTopNavBarItem(String navInfo){
//            driver.findElement(By.linkText(navInfo));
//        }
//        public void signIn(){
//            driver.findElement(By.id("myRewardsLabel")).click();
//        }
//        public void nearbyStoreInfo(){
//            driver.findElement(By.className("store-info-name")).click();
//        }
//
//        public void searchBySearchBox(String itemName){
//            driver.findElement(By.id("globalSearchInputField")).sendKeys(itemName);
//            driver.findElement(By.id("searchSubmit")).click();
//        }
//        public void shoppingCart(){
//            driver.findElement(By.cssSelector("a[title='shopping bag']")).click();
//        }
//    }


//
//    @FindBy (linkText = "Create a List")
//    WebElement listlink;
//    @FindBy (linkText = "Find a Gift")
//    WebElement findGiftlink;
//    @FindBy(linkText = "Explore Idea Lists")
//    WebElement ideaListLink;
//    @FindBy(linkText = "Discover")
//    WebElement discoverLink;
//    @FindBy(linkText = "Your Orders")
//    WebElement ordersLink;

//
//    public void selectCreateAListFromMouseHover() {
//        Actions actions = new Actions(driver);
//        actions.moveToElement(signInBtn).perform();
//        actions.moveToElement(listlink).perform();
//        actions.click().build().perform();
//    }
//    public void selectFindGiftFromMouseHover() {
//        Actions actions = new Actions(driver);
//        actions.moveToElement(signInBtn).perform();
//        actions.moveToElement(findGiftlink).perform();
//        actions.click().build().perform();
//    }
//    public void selectIdeaListFromMouseHover() {
//        Actions actions = new Actions(driver);
//        actions.moveToElement(signInBtn).perform();
//        actions.moveToElement(ideaListLink).perform();
//        actions.click().build().perform();
//    }
//    public void canSignUpFromMouseHover() {
//        Actions actions = new Actions(driver);
//        actions.moveToElement(signInBtn).perform();
//        actions.moveToElement(signInLink).perform();
//        actions.click().build().perform();
//    }
//    public void canDiscoverOptionsFromMouseHover() {
//        Actions actions = new Actions(driver);
//        actions.moveToElement(signInBtn).perform();
//        actions.moveToElement(discoverLink).perform();
//        actions.click().build().perform();
//    }
//    public void cancheckOrderListOptionsFromMouseHover() {
//        Actions actions = new Actions(driver);
//        actions.moveToElement(signInBtn).perform();
//        actions.moveToElement(ordersLink).perform();
//        actions.click().build().perform();
//    }
//
//    public void signIn(String s, String s1) {
//    }
//
//    public void forgotToSignIn(String s) {
//    }
//
//    public void navigateToForgotSignIn(String s) {
//    }
}
