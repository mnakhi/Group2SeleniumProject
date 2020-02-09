package search;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MoreSearch extends CommonAPI {
    @FindBy(id = "searchDropdownBox")
    WebElement dropdownBtn;
    @FindBy(css="option[value='search-alias=audible']")
    WebElement selectAudible;
    @FindBy(css="option[value='search-alias=handmade']")
    WebElement selectHandMade;
    @FindBy(css="option[value='search-alias=appliances']")
    WebElement selectAppliances;
    @FindBy(css="option[value='search-alias=under-ten-dollars']")
    WebElement selectItemUnderTenDollars;
    @FindBy(css="option[value='search-alias=pets']")
    WebElement selectPetFood;
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;
    @FindBy(css = "input[class='nav-input']")
    WebElement submitBtn;
    public void navigateToAmazon() {
        driver.get("https://www.amazon.com/");
    }
    public void selectAudibleOption(String word) throws InterruptedException {
        dropdownBtn.click();
        selectAudible.click();
        searchBox.sendKeys(word);
        submitBtn.click();
    }
    public void selectHandMadeOption(String word) throws InterruptedException {
        dropdownBtn.click();
        selectAudible.click();
        searchBox.sendKeys(word);
        submitBtn.click();
    }
    public void selectAppliancesOption(String word){
        dropdownBtn.click();
        selectAppliances.click();
        searchBox.sendKeys(word);
        submitBtn.click();
    }
    public void selectItemUnderTenDollarsOption(String word){
        dropdownBtn.click();
        selectItemUnderTenDollars.click();
        searchBox.sendKeys(word);
        submitBtn.click();
    }
    public void selectPetFoodOption(String word){
        dropdownBtn.click();
        selectItemUnderTenDollars.click();
        selectPetFood.sendKeys(word);
        submitBtn.click();
    }
}
