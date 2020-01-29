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
    @Test
    public void testUserCanUseDropdownToGoToIdeaListPage() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.selectIdeaListFromMouseHover();
    }
    @Test
    public void testUserCanUseDropdownToGoToSignUpPage() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canSignUpFromMouseHover();
    }
    @Test
    public void testUserCanUseDropdownToGoToDiscoverPage() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canDiscoverOptionsFromMouseHover();
    }
    @Test
    public void testUserCanUseDropdownToGoToOrderListPage() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.cancheckOrderListOptionsFromMouseHover();
    }
}
