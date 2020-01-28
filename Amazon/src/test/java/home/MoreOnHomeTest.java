package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MoreOnHomeTest extends CommonAPI {
//    @Test
//    public void testUserCanGoToSellPage() {
//        HomePage hm = PageFactory.initElements(driver, HomePage.class);
//        hm.useAmazonBasicsBtn();
//    }
//    @Test
//    public void testUserCanGoToCouponPage() {
//        HomePage hm = PageFactory.initElements(driver, HomePage.class);
//        hm.useCouponBtn();
//    }
//    @Test
//    public void testUserCanGoToWholeFoodsPage() {
//        HomePage hm = PageFactory.initElements(driver, HomePage.class);
//        hm.useWholeFoodsBtn();
//    }
//    //fail
//    @Test
//    public void testUserCanClickOndropDownMenu(){
//        HomePage hm = PageFactory.initElements(driver, HomePage.class);
//        hm.dropDown();
//    }
//    @Test
//    public void testUserCanClickOnCountryBtn(){
//        HomePage hm = PageFactory.initElements(driver, HomePage.class);
//        hm.useCountryBtn();
//    }
    @Test
    public void testUserCanClick(){
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.s("momenun.akhi@gmail.com");
    }
}
