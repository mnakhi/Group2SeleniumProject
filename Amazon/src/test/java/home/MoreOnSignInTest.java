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
    public void testUserCanUseDropdownToGoToDiscoverPage() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canDiscoverOptionsFromMouseHover();
    }
    @Test
    public void testUserCanUseDropdownToGoToOrderListPage() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.cancheckOrderListOptionsFromDropdown();
    }
    @Test
    public void testUserCanUseDropdownToGoToPrimeMembershipInformation() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canGoTOPrimeMembershipFromDropdown();
    }
    @Test
    public void testUserCanGoToMusicLibraryPage() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canGoTOMusicLibraryFromDropdown();
    }
    @Test
    public void testUserCanCheckTheirPantryList() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canGoTOPantryListsFromDropdown();
    }
    @Test
    public void testUserCanCheckTheirRecommendation() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canGoTORecommendationFromDropdown();
    }
    @Test
    public void testUserCanGoToCharityList() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canGoTOCharityListFromDropdown();
    }
    @Test
    public void testUserCanStartASellingAccount() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canGoTOSellAccountFromDropdown();
    }
    @Test
    public void testUserCanGoToSubscribeNSaveBtn() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canGoTOSubscribeNSaveItemFromDropdown();
    }
    @Test
    public void testUserCanGoToTheirCreditCardsOption() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canGoTOYourCreditCardFromDropdown();
    }
    @Test
    public void testUserCanRegisterForBusinessAccount() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canGoToBusinessAccountFromDropdown();
    }
    @Test
    public void testUserCanGoToTheirContentNDevices() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canGoToContentNDeviceOptionFromDropdown();
    }
    @Test
    public void testUserCanCheckForAmazonShowRooms() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canCheckForShowroomsFromDropdown();
    }
    @Test
    public void testUserCanLookForAndroidApps() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canLookForAndroidAppsFromDropdown();
    }
    @Test
    public void testUserCanLookForAmazonPhotoOption() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canLookForAmazonPhotoBtnFromDropdown();
    }
    @Test
    public void testUserCanLookForPrimeVideo() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canLookForPrimeVideo();
    }
    @Test
    public void testUserCanGoToTheirWatchList() throws Exception {
        MoreOnSignIn hm = PageFactory.initElements(driver,MoreOnSignIn.class);
        hm.canLookForWatchList();
    }
}
