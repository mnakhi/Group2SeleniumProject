package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

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
    WebElement singInBtn;
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
        singInBtn.click();
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
    public void useCountryBtn(){
        countryBtn.click();
    }
    public void s(String name){
        goToSignIn();
        emailBtn.sendKeys(name);
        continueBtn.click();
    }
}
