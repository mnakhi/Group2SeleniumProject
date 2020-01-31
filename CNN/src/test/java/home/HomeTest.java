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
    public void TestClickSearchIcon() {
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
    public void TestSearchAmerica() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.searchAmerica();
    }

    @Test
    public void TestUSButton() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.USbutton();
    }

    @Test
    public void TestWorldButton() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.WorldButton();
    }

    @Test
    public void TestPoliticsButton() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.PoliticsButton();
    }

    @Test
    public void TestBusinessButton() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.BusinessButton();
    }

    @Test
    public void TestOpinionButton() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.OpinionButton();
    }

    @Test
    public void TestHealthButton() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.HealthButton();
    }

    @Test
    public void TestEntertainmentButton() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.EntertainButton();
    }

    @Test
    public void TestStyleButton() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.StyleButton();
    }

    @Test
    public void TestTravelButton() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.TravelButton();
    }

    @Test
    public void TestAllCNNButton() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.AllCNNButton();
    }

    @Test
    public void TestStoriesTab() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.StoriesTab();
    }

    @Test
    public void TestVideosTab() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.VideosTab();
    }

    @Test
    public void TestPhotosTab() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.PhotosTab();
    }

    @Test
    public void TestDropDown() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.DropDown();
    }

    @Test
    public void TestClearSearch() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.ClearSearch();
    }

    @Test
    public void TestCNNHome() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.CNNHome();
    }

    @Test
    public void TestHeaderTabUSA() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.HeaderTabUSA();
    }

    @Test
    public void TestHeaderTabWorld() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.HeaderTabWORLD();
    }

    @Test
    public void TestHeaderTabPolitics() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.HeaderTabPolitics();
    }

    @Test
    public void TestHeaderTabOpinion() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.HeaderTabOpinion();
    }

    @Test
    public void TestHeaderTabHealth() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.HeaderTabHealth();
    }

    @Test
    public void TestHeaderTabEntertainment() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.HeaderTabEntertainment();
    }

    @Test
    public void TestHeaderTabStyle() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.HeaderTabStyle();
    }

    @Test
    public void TestHeaderTabTravel() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.HeaderTabTravel();
    }

    @Test
    public void TestHeaderTabSprots() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.HeaderTabSports();
    }

    @Test
    public void TestHeaderTabVideos() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.HeaderTabVideo();
    }

    @Test
    public void Test_Videos_DigitalStudioHeaderTab() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.Videos_DigitalStudioHeaderTab();
    }

    @Test
    public void TestCarouselRight() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.CarouselRight();
    }

    @Test
    public void TestCarouselLeft() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.CarouselLeft();
    }

    @Test
    public void Test_Videos_DigitalShortsTab() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.Videos_DigitalShortsTab();
    }

    @Test
    public void Test_Videos_HLNTab() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.Videos_HLNTab();
    }

    @Test
    public void Test_Videos_TVScheduleTab() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.Videos_TVScheduleTab();
    }

    @Test
    public void Test_TVSchedule_AfternoonTab() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.TVSchedule_AfternoonTab();
    }

    @Test
    public void Test_TVSchedule_EveningTab() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.TVSchedule_EveningTab();
    }

    @Test
    public void Test_TVSchedule_OvernightTab() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.TVSchedule_OvernightTab();
    }

    @Test
    public void Test_TVSchedule_MorningTab() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.TVSchedule_MorningTab();
    }

    @Test
    public void Test_TVScheduleDropDrown() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.TVScheduleDropDrown();
    }

    @Test
    public void Test_DropdownFriday() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.DropdownFriday();
    }

    @Test
    public void Test_DropdownSaturday() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.DropdownSaturday();
    }

    @Test
    public void Test_DropDownSunday() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.DropDownSunday();
    }

    @Test
    public void Test_DropdownMonday() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.DropdownMonday();
    }

    @Test
    public void Test_DropdownTuesday() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.DropdownTuesday();
    }

    @Test
    public void Test_DropDownWed() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.DropDownWed();
    }

    @Test
    public void Test_DropdownThurs() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.DropdownThurs();
    }

    @Test
    public void Test_TvShowsAZTab() {
        HomePage hp = PageFactory.initElements(driver, HomePage.class);
        hp.TvShowsAZTab();
    }


}
