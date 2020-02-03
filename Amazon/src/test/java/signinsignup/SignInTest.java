package signinsignup;

import common.CommonAPI;
import home.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInTest extends CommonAPI {

    @Test
    public void testUserCanClickToGoToSignInPage() {
        SignIn signIn = PageFactory.initElements(driver, SignIn.class);
        signIn.signIn("john11doe200@yahoo.com", "Abc78910");
    }

    @Test
    public void testUserCanClickOnForgotPasswordForSignIn() {
        SignIn signIn = PageFactory.initElements(driver, SignIn.class);
        signIn.forgotToSignIn("john11doe200@yahoo.com");
    }

    @Test
    public void testUserCanNavigateToForgotPasswordPage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.navigateToForgotSignIn("john11doe200@yahoo.com");
    }

}
