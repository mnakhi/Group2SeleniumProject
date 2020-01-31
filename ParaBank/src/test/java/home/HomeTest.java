package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {
    //write test cases
    @Test
    public void testUserCanNavigateToAboutUsPage() throws Exception {
        HomePage homePage= PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnAbtUs();
    }
    @Test
    public void testUserCanNavigateToServicePage() throws Exception {
        HomePage homePage= PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnService();
    }
    @Test
    public void testUserCanNavigateToProductsPage() throws Exception {
        HomePage homePage= PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnProducts();
    }
    @Test
    public void testUserCanNavigateToLocationsInformationPage() throws Exception {
        HomePage homePage= PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnLocations();
    }
    @Test
    public void testUserCanNavigateToAdminPage() throws Exception {
        HomePage homePage= PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnLocations();
    }

}
