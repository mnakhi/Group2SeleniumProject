package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageTest extends CommonAPI {

    @Test
    public void testUserCanLogIn() throws Exception {
        LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
        loginPage.login("John","Abc123789");
    }
    @Test
    public void testUserCanNavigateToAdminPage() throws Exception {
        LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
        loginPage.clickOnForgotLogin();
    }
    @Test
    public void testUserCanNavigateWhenForgottenUserInfo() throws Exception {
        LoginPage loginPage= PageFactory.initElements(driver, LoginPage.class);
        loginPage.provideInfoForForgetLogin("John","Doe","1234","Queens","NJ","1212121","33333333333333");
    }
}
