package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class HomePageTest extends CommonAPI {
    //write test cases
    @Test
    public void testUserCanUseSearchBox() {
        HomePage searchPage = PageFactory.initElements(driver, HomePage.class);
        searchPage.searchNClick("Boots");
    }

    @Test
    public void testUserAbleToClickOnDropdownMenu() {
        HomePage shopByDepartment = PageFactory.initElements(driver, HomePage.class);
        shopByDepartment.searchNClick("");
    }
}
