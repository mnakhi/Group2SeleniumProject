package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HamburgerFunctionsTest extends CommonAPI {
    @Test
    public void testUserCanNavigateToPrimeOptionsAndNavigateBackToHamburgerOptions() throws Exception {
        HamburgerFunctions hm = PageFactory.initElements(driver,HamburgerFunctions.class);
        hm.primeVideoOption();
    }
    @Test
    public void testUserCanNavigateToEchoOptionsAndNavigateBackToHamburgerOptions() throws Exception {
        HamburgerFunctions hm = PageFactory.initElements(driver,HamburgerFunctions.class);
        hm.primeVideoOption();
    }
}
