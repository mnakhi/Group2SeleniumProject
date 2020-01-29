package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class HomePage extends CommonAPI {
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;
    @FindBy(css = "input[class='nav-input']")
    WebElement submitBtn;
    @FindBy(css = "span[class='nav-sprite nav-logo-base']")
    WebElement amazonLogo;
    @FindBy(xpath = "//*[@id=\"icp-nav-flyout\"]/span/span[1]")
    WebElement returnBtn;
    @FindBy(id = "nav-cart")
    WebElement shoppingCartBtn;
    @FindBy(id = "nav-link-prime")
    WebElement primeBtn;
    @FindBy(id = "nav-link-accountList")
    WebElement signBtn;
    @FindBy(id = "nav-hamburger-menu")
    WebElement hamburgerIcon;
    @FindBy(css = "a[class='nav-a nav-a-2 a-popover-trigger a-declarative']")
    WebElement addressBtn;
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[1]")
    WebElement todaysDealBtn;
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[2]")
    WebElement bestSellersBtn;
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[3]")
    WebElement customerServiceBtn;
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[4]")
    WebElement findGiftBtn;
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[5]")
    WebElement newReleaseBtn;
    @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[6]")
    WebElement registryBtn;
    @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[7]")
    WebElement giftCardBtn;
    @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[8]")
    WebElement sellBtn;
    @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[9]")
    WebElement amazonBasicsBtn;
    @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[10]")
    WebElement couponBtn;
    @FindBy(xpath="//*[@id=\"nav-xshop\"]/a[11]")
    WebElement wholeFoodsBtn;
    @FindBy(css="select[class='nav-search-dropdown searchSelect']")
    WebElement allDropdownValue;
    @FindBy(id="icp-touch-link-country")
    WebElement countryBtn;
    @FindBy(id="ap_email")
    WebElement emailBtn;
    @FindBy(id="continue")
    WebElement continueBtn;
    @FindBy(linkText = "Careers")
    WebElement careersLink;
    @FindBy(css="input[type='password']")
    WebElement passwordBtn;
    @FindBy(css="span[class='a-button-inner']")
    WebElement signInBtn;
    @FindBy(id="auth-fpp-link-bottom")
    WebElement forgotBtn;
    @FindBy(xpath = "//*[@id=\"rhf-container\"]/div[2]/span")
    WebElement customizedBtn;
    @FindBy(xpath = "//*[@id=\"nav-flyout-icp\"]/div[2]/span[1]/span/i")
    WebElement englishEnBtn;
    @FindBy(xpath = "//*[@id=\"nav-flyout-icp\"]/div[2]/a[1]/span/i")
    WebElement espanolBtn;
    @FindBy(css = "icp-nav-link-inner")
    WebElement worldIcon;
    public void navigateToFacebook() {
        driver.get("https://www.amazon.com/");
    }

    public void clickOnAmazonLogo() {
        amazonLogo.click();
    }

    public void searchNClick(String itemName) {
        this.navigateToFacebook();
        searchBox.sendKeys("name");
        submitBtn.click();
    }

    public void returnNOrderProduct() {
        returnBtn.click();
    }

    public void checkShoppingCart() {
        shoppingCartBtn.click();
    }

    public void gotoPrime() {
        primeBtn.click();
    }

    public void goToSignIn() {
        signBtn.click();
    }

    public void hamburgerIconForOptions() {
        hamburgerIcon.click();
    }

    public void useAddressBtn() {
        addressBtn.click();
    }

    public void useTodaysDealBtn() {
        todaysDealBtn.click();
    }

    public void useBestSellersBtn() {
        bestSellersBtn.click();
    }

    public void useCustomerServiceBtn() {
        customerServiceBtn.click();
    }

    public void useFindGiftBtn() {
        findGiftBtn.click();
    }

    public void useNewReleaseBtn() {
        newReleaseBtn.click();
    }

    public void useRegistryBtn(){
        registryBtn.click();
    }
    public void useGiftCardBtn(){
        giftCardBtn.click();
    }
    public void useSellBtn(){
        sellBtn.click();
    }
    public void useAmazonBasicsBtn(){
        amazonBasicsBtn.click();
    }
    public void useCouponBtn(){
        couponBtn.click();
    }
    public void useWholeFoodsBtn(){
        wholeFoodsBtn.click();
    }
    //failed the method
    public void dropDown(){
        List<WebElement> element = getListOfWebElementsByCss(".nav-search-dropdown.searchSelect option");
        List<String> listOfText = getListOfString(element);
        List<String> expectedMenu = listOfText;
        Assert.assertEquals(listOfText,expectedMenu);

    }
    public void signIn(String name,String password){
        goToSignIn();
        emailBtn.sendKeys(name);
        continueBtn.click();
        passwordBtn.sendKeys(password);
        signInBtn.click();

    }
    public void useCountryBtn(){
        countryBtn.click();
    }
    public void clickOnCareer(){
        careersLink.click();
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
    //fail
    public void chooseLanguage(String language){
        Actions actions=new Actions(driver);
        actions.moveToElement(worldIcon).perform();
        if(language.equalsIgnoreCase("English - EN")) {
            actions.moveToElement(englishEnBtn).click();
            actions.click().build().perform();
        }else if(language.equalsIgnoreCase("Español - ES")){
            actions.moveToElement(espanolBtn).click();
            actions.click().build().perform();
        }else{
            System.out.println("Not a valid input!!");
        }

    }
}
