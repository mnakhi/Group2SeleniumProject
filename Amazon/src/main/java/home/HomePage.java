package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
        findGiftBtn.click();
    }
}
