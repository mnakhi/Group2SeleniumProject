package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"headerPanel\"]/ul[1]/li[2]/a")
    WebElement abtUsBtn;
    @FindBy(xpath = "//*[@id=\"headerPanel\"]/ul[1]/li[3]/a")
    WebElement serviceBtn;
    @FindBy(xpath="//*[@id=\"headerPanel\"]/ul[1]/li[4]/a")
    WebElement productsBtn;
    @FindBy(xpath = "//*[@id=\"headerPanel\"]/ul[1]/li[5]/a")
    WebElement locationsBtn;
    @FindBy(xpath = "//*[@id=\"headerPanel\"]/ul[1]/li[6]/a")
    WebElement adminBtn;
    @FindBy(linkText = "Home")
    WebElement homeLink;
    @FindBy(linkText = "About Us")
    WebElement aboutUsLink;

    public void navigateToAmazon() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
    }

    public void clickOnAbtUs(){
        abtUsBtn.click();
    }
    public void clickOnService(){
        serviceBtn.click();
    }
    public void clickOnProducts(){
        productsBtn.click();
    }
    public void clickOnLocations(){
        locationsBtn.click();
    }
    public void clickOnAdminPage(){
        adminBtn.click();
    }
}

