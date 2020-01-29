package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MoreOnSignInTest extends CommonAPI {
    @Test
    public void testUserCanUseDropdownToGoToCreateListPage() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.selectCreateAListFromMouseHover();
    }
    @Test
    public void testUserCanUseDropdownToGoToFindAGiftPage() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.selectCreateAListFromMouseHover();
    }
}
