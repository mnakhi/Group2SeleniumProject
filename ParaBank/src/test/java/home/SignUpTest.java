package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignUpTest extends CommonAPI {
    @Test
    public void testUserCanNavigateToAdminPage() throws Exception {
        SignUpPage signUpPage= PageFactory.initElements(driver, SignUpPage.class);
        signUpPage.clickOnRegister();
    }
    @Test
    public void testUserCanRegister() throws Exception {
        SignUpPage signUpPage= PageFactory.initElements(driver, SignUpPage.class);
        signUpPage.registerForAccount("John","Doe","12-93 fake street","Brooklyn","NY","55555","1111111111","0000000000","JOhn Doe","Can'tRemember");
    }

}
