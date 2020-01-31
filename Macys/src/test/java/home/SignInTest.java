package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInTest extends CommonAPI {

    @Test
    public void testUserCanSignIn() {
        HomePage signIn = PageFactory.initElements(driver, HomePage.class);
        signIn.searvhNClick("momenun.akhi@gmail.com", "Vabetare~~~08");
    }
}
