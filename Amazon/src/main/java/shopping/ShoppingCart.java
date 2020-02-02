package shopping;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends CommonAPI {
    @FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
    WebElement addToCartBtn;
    public void navaigate(){
        driver.get("https://www.amazon.com/iPhone-Built-Protector-i-Blason-Glitter/dp/B07K71V19F/ref=sr_1_10?keywords=phone+case&qid=1580619362&sr=8-10");
    }
    public void clickOnToAddItem(){
        addToCartBtn.click();
    }
}
