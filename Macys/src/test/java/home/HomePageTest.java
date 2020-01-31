package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {
    //write test cases

    @Test
    public void testUserCanUseSearchBox() {
        HomePage searchPage = PageFactory.initElements(driver, HomePage.class);
        searchPage.searchNClick("");
    }
    @Test
    public void testUserAbleToClickOnDropdownMenu() {
        HomePage shopByDepartment = PageFactory.initElements(driver, HomePage.class);
        shopByDepartment.searchNClick("Men");
    }

}





//
//    }
//    @Test
//    public void testUserAbleToGoToSpecificPagesBySelectingFromDropdownOption(){
//        driver.get("https://www.macys.com/");
//        HomePage hm = new HomePage();
//        hm.clickingOnSpecificDepartment("Women");
//    }
//    @Test
//    public void testUserCanSelectFromTopNavBar() {
//        driver.get("https://www.macys.com/");
//        HomePage hm = new HomePage();
//        hm.clickingOnTopNavBarItem("STORES");
//    }
//    @Test
//    public void testUserCanGoToSignInPage(){
//        driver.get("https://www.macys.com/");
//        HomePage hm = new HomePage();
//        hm.signIn();
//    }
//    @Test
//    public void testUserCanCheckOnNearbyStoreInformation(){
//        driver.get("https://www.macys.com/");
//        HomePage hm = new HomePage();
//        hm.nearbyStoreInfo();
//    }
//    @Test
//    public void testUserCanClickOnShoppingCart() {
//        driver.get("https://www.macys.com/");
//        HomePage hm = new HomePage();
//        hm.shoppingCart();
//    }


