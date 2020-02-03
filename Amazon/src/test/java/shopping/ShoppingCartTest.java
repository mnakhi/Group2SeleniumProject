package shopping;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ShoppingCartTest extends CommonAPI {
    @Test
    public void testUserCanAddItemToTheirShoppingCart() {
        ShoppingCart shoppingCart = PageFactory.initElements(driver, ShoppingCart.class);
        shoppingCart.addToCart();
    }

}
