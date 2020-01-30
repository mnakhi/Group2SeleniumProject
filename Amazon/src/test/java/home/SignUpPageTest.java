package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignUpPageTest extends CommonAPI {
    @Test
    public void testUserCanGoToSignUpforAmazonAccount(){
        SignUpPage signUp = PageFactory.initElements(driver,SignUpPage.class);
        signUp.canGoToSignUpPage();
    }
}
