package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInTest extends CommonAPI {

    @Test
    public void testUserCanClickGoToSignInPage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.signIn("john11doe200@yahoo.com", "Abc78910");
    }

    @Test
    public void testUserCanClickOnForgotPassword() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.forgotToSignIn("john11doe200@yahoo.com");
    }

    @Test
    public void testUserCanNavigateToForgotPasswordPage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.navigateToForgotSignIn("john11doe200@yahoo.com");
    }

}
