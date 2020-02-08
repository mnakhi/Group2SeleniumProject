package search;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchNSelectNBuy extends CommonAPI {
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;
    @FindBy(css = "input[class='nav-input']")
    WebElement submitBtn;
    @FindBy(linkText = "Mystery & Suspense")
    WebElement mysteryLink;
    @FindBy(xpath = "//*[@id=\"acs-product-block-2\"]/a/span/span[2]")
    WebElement bookSpecification;
    @FindBy(xpath = "//*[@id=\"a-autoid-2\"]/span")
    WebElement buyOption;
    @FindBy(id="buy-now-button")
    WebElement buyNowBtn;
    @FindBy(id="ap_email")
    WebElement emailBtn;
    @FindBy(id="continue")
    WebElement continueBtn;
    @FindBy(css="input[type='password']")
    WebElement passwordBtn;
    @FindBy(css="span[class='a-button-inner']")
    WebElement signInBtn;
    @FindBy(id="submitOrderButtonId")
    WebElement placeOrderBtn;
    public void navigateToAmazon() {
        driver.get("https://www.amazon.com/");
    }
    public void searchNClick(String itemName) {
        this.navigateToAmazon();
        searchBox.sendKeys(itemName);
        submitBtn.click();
    }
    public void signIn(String name,String password){
        emailBtn.sendKeys(name);
        continueBtn.click();
        passwordBtn.sendKeys(password);
        signInBtn.click();

    }
    public void buyItems(){
        searchNClick("book");
        mysteryLink.click();
        bookSpecification.click();
        buyOption.click();
        buyNowBtn.click();
        signIn("john11doe200@yahoo.com","Abc78910");
        placeOrderBtn.click();
    }
}
