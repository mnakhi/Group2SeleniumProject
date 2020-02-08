package search;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SearchNSelectNBuyTest extends CommonAPI {
    @Test
    public void testUserCanNavigateToRewardVisaSignatureCard(){
        SearchNSelectNBuy helpOptions = PageFactory.initElements(driver,SearchNSelectNBuy.class);
        helpOptions.buyItems();
    }
}
