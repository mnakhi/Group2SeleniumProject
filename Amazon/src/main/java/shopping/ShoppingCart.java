package shopping;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ShoppingCart extends CommonAPI {
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;
    @FindBy(css = "input[class='nav-input']")
    WebElement submitBtn;
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[1]")
    WebElement todaysDealBtn;
    @FindBy(id="101 16563b45-announce")
    WebElement addToCartBtn;
    @FindBy(id="nav-cart-count")
    WebElement cartBtn;
    public void navigateToAmazon(){
        driver.get("https://www.amazon.com/");
    }
    public void searchNClick(String itemName) {
        this.navigateToAmazon();
        searchBox.sendKeys(itemName);
        submitBtn.click();
    }
    public void useTodaysDealBtn() {
        todaysDealBtn.click();
    }
    public void clickOnToAddItem(){
        addToCartBtn.click();
    }
    public void addToCart(){
        navigateToAmazon();
        useTodaysDealBtn();
        addToCartBtn.click();
        cartBtn.click();
        String expected = "Amazon.com Shopping Cart";
        Assert.assertEquals(driver.getTitle(),expected);
    }
}
