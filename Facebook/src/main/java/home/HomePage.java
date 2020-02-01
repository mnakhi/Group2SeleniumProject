package home;

import common.CommonAPI;
import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class HomePage extends CommonAPI {
    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "pass")
    WebElement passwordField;

    @FindBy(css = "input[value='Log In']")
    WebElement logInBtn;

    @FindBy(css = "input[data-testid='search_input']")
    WebElement searchBar;

    @FindBy(css = "a[title='Go to Facebook home']")
    WebElement facebookTab;

    @FindBy(css = "i[class='_585_']")
    WebElement clickonSearchBtn;

    @FindBy(id = "findFriendsNav")
    WebElement openFindFriendsTab;

    @FindBy(id = "creation_hub_entrypoint")
    WebElement openCreateTab;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div[2]/div/a/div")
    WebElement clickOnMessengerIcon;

    @FindBy(css = "div[class='_2n_9 f_click']")
    WebElement clickOnFindFriendsIcon;

    @FindBy(css = "a[ href='https://www.facebook.com/?ref=tn_tnmn']")
    WebElement homeButton;

    @FindBy(css = "div[class='_59fb _tmz']")
    WebElement quickHelpIcon;

    @FindBy(css = "a[class='_n28']")
    WebElement helpCenterTab;

    @FindBy(css = "input[placeholder='How can we help?']")
    WebElement helpCenterSearchBox;

    @FindBy(css = "i[class='_3fzs img sp_rbNz2WbUnoM_2x sx_7858e6']")
    WebElement helpCenterSearchBtn;

    @FindBy(css = "div[data-click=\"home_icon\"]")
    WebElement homeIcon;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div[3]/div/a/div")
    WebElement notificationsIcon;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div[3]/div/div/div[2]/div/div[1]/div/a[2]")
    WebElement notificationsSettings;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div[3]/div/div/div[4]/a/span")
    WebElement seeAllNotificationsInfo;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[3]/div[1]/div/div/div[2]/div/div/div[4]/div[2]/a")
    WebElement quickHelpPrivacyShortcuts;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[3]/div[1]/div/div/div[2]/div/div/div[4]/a[1]/table/tbody/tr/td[2]/div")
    WebElement quickHelpSupportInboxTab;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[3]/div[1]/div/div/div[2]/div/div/div[4]/a[2]/table/tbody/tr/td[2]/div")
    WebElement ReportProblemsTab;

    @FindBy(css = "a[title='Close']")
    WebElement InReportProblemsCancelBtn;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div/a")
    WebElement createNewGroup;

    @FindBy(css = "label[tabindex='-1']")
    WebElement searchForPeopleToAddTab;

    @FindBy(css = "div[class='_2elw _2ph- clearfix']")
    WebElement selectedTab;

    @FindBy(css = "a[action='cancel']")
    WebElement clickOnCancelBtn;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[1]/div/div/div/div[2]/div[3]/div[2]/div/div/a/div")
    WebElement dropDownIcon;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div[2]/div[1]/div/div/div/div/div[3]/div[2]/ul/li[21]/a")
    WebElement clickOnSeeMoreOptions;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div[2]/div[1]/div/div/div/div/div/div/div[3]/div[2]/ul/li[6]/a/div")
    WebElement FriendLists;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div[2]/div[1]/div/div/div/div/div/div/div[3]/div[2]/ul/li[7]/a/div")
    WebElement haveGames;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div[2]/div[1]/div/div/div/div/div/div/div[3]/div[2]/ul/li[9]/a/div")
    WebElement haveWeather;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div[2]/div[1]/div/div/div/div/div/div/div[3]/div[2]/ul/li[17]/a/div")
    WebElement jobsIcon;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/div/div/div/ul/div[1]/label")
    WebElement jobSearchTab;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/div/div/div/ul/div[1]/button")
    WebElement jobSearchBtn;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/div/div/div/ul/div[3]/div/ul/div[2]/label[2]")
    WebElement partTimeJobCheckBox;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div[2]/div[1]/div/div/div/div/div[3]/div[2]/ul/li[5]/a/div")
    WebElement clickOnEventsTab;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div/div[2]/div[4]/a/span")
    WebElement discoverTab;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div/div[1]/div/ul/li[4]/div/ul/li[3]")
    WebElement comedyCheckBox;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div/div[2]/div[2]/a/span")
    WebElement calenderTab;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div/div[2]/div[5]/a")
    WebElement hostingTab;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div[2]/div[1]/div/div/div/div/div/div/div[3]/div[2]/ul/li[19]/a/div")
    WebElement gamingVideoTab;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div[2]/div[1]/div/div/div/div/div/div/div[3]/div[2]/ul/li[20]/a/div")
    WebElement savedTab;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]/div/div[1]/div/div/div[5]/a")
    WebElement newCollectionTab;

    @FindBy(css = "label[class='_55r1 _55r2 _58ak _3ct8']")
    WebElement createCollectiontab;

    public void navigateToFacebook() {
        driver.get("https://facebook.com");
    }

    public void logInFacebook(String email, String password) {
        this.navigateToFacebook();
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        logInBtn.click();
    }

    public void home() {
        homeIcon.click();
    }

    public void goToFacebookHome() {
        facebookTab.click();
    }

    public void writeSomethingOnSearchBar(String name) {
        searchBar.sendKeys(name);
        clickonSearchBtn.click();
    }

    public void canFindFriends() {
        openFindFriendsTab.click();
    }

    public void clickOnCreateTab() {
        openCreateTab.click();
    }

    public void getMessageUsingMessenger() {
        clickOnMessengerIcon.click();
    }

    public void getFriends() {
        clickOnFindFriendsIcon.click();
    }

    public void clickOnHomeTab() {
        homeButton.click();
    }

    public void clickOnQuickHelpIcon() {
        quickHelpIcon.click();
    }

    public void clickOnHelpCenterTab() {
        helpCenterTab.click();
    }

    public void writeInHelpCenterSearchBox(String name) {
        helpCenterSearchBox.sendKeys(name);
    }

    public void clickOnHelpCenterSearchBtn() {
        helpCenterSearchBtn.click();
    }

    public void clickOnNotificationsIcon() {
        notificationsIcon.click();
    }

    public void goToNotificationsSettings() {
        notificationsSettings.click();
    }

    public void notificationsSeeAllInfo() {
        seeAllNotificationsInfo.click();
    }

    public void InQuickHelpTabCanGetPrivacyShortcutsInfo() {
        quickHelpIcon.click();
        quickHelpPrivacyShortcuts.click();
    }

    public void InQuickHelpTabSupportInboxInfo() {
        quickHelpIcon.click();
        quickHelpSupportInboxTab.click();
    }

    public void canGetReportProblemsInfo() {
        quickHelpIcon.click();
        ReportProblemsTab.click();
    }

    public void canGetReportProblemsCancelBtn() {
        quickHelpIcon.click();
        ReportProblemsTab.click();
        InReportProblemsCancelBtn.click();
    }

    public void createNewGroupForMessaging() {
//        clickOnMessengerIcon.click();
        createNewGroup.click();
    }

    public void canSearchForPeopleToAdd(String name) {
        searchForPeopleToAddTab.sendKeys(name);
    }

    public void ItShowsSelected() {
        selectedTab.click();
    }

    public void IfYouDontWantToAddPeopleInTheGroup() {
        clickOnCancelBtn.click();
    }

    public void clickOnDropDownIcon() {
        dropDownIcon.click();
    }

    public void canGetMoreOptions() {
        clickOnSeeMoreOptions.click();
    }

    public void canHaveFriendLists() {
        FriendLists.click();
    }

    public void canHaveGames() {
        haveGames.click();
    }

    public void canHaveWeather() {
        haveWeather.click();
    }

    public void canHaveJobsInfo() {
        jobsIcon.click();
    }

    public void searchJobsOnFb(String name) {
        jobSearchTab.sendKeys(name);
    }

    public void JobSearchBtn() {
        jobSearchBtn.click();
    }

    public void havePartTimeJobCheckBox() {
        partTimeJobCheckBox.click();
    }

    public void canHaveEvents() {
        clickOnEventsTab.click();
    }

    public void hasDiscoverInfo() {
        discoverTab.click();
    }

    public void clickOnComedyCheckBox() {
        comedyCheckBox.click();
    }

    public void calenderInfo() {
        calenderTab.click();
    }

    public void hostingInfo() {
        hostingTab.click();
    }

    public void gamingVideoInfo() {
        gamingVideoTab.click();
    }

    public void savedInfo() {
        savedTab.click();
    }

    public void canGetNewCollection() {
        newCollectionTab.click();
    }

    public void canCreateAnyCollectionsName(String name) {
        createCollectiontab.sendKeys(name);
    }
}
