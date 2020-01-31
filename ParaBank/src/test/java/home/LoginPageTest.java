package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageTest extends CommonAPI {

    @Test
    public void testUserCanNavigateToAdminPage() throws Exception {
        LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickOnForgotLogin();
    }
}
