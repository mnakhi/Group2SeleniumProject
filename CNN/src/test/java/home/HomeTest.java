package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class HomeTest extends CommonAPI {


    // Invoke CNN test
    @Test
    public void TestInvokeCNNPage() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.InvokeCNN();

    }

    @Test
    public void TestClickSearch() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.Clicksearch_icon();
    }

    @Test
    public void TestExitSearchButton() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.Exitsearch_icon();
    }

    @Test
    public void TestClickMedia() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.clickMedia();
    }
    @Test
    public void TestSearchAmerica(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.searchAmerica();
    }
    @Test
    public void TestUSButton(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.USbutton();
    }
    @Test
    public void TestWorldButton(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.WorldButton();
    }
    @Test
    public void TestPoliticsButton(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.PoliticsButton();
    }
    @Test
    public void TestBusinessButton(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.BusinessButton();
    }
    @Test
    public void TestOpinionButton(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.OpinionButton();
    }
    @Test
    public void TestHealthButton(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.HealthButton();
    }
    @Test
    public void TestEntertainmentButton(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.EntertainButton();
    }
    @Test
    public void TestStyleButton(){
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.StyleButton();
    }


}
