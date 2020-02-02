package shopping;

import common.CommonAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ShoppingCartTest extends CommonAPI {
    @Test
    public void testUserCanPayTheirBillOnline() {
        ShoppingCart shoppingCart = PageFactory.initElements(driver, ShoppingCart.class);
        shoppingCart.clickOnToAddItem();
    }

}
