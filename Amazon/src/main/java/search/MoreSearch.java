package search;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MoreSearch extends CommonAPI {
    @FindBy(id = "searchDropdownBox")
    WebElement dropdownBtn;
    @FindBy(css="option[value='search-alias=audible']")
    WebElement selectAudible;
    @FindBy(css="option[value='search-alias=handmade']")
    WebElement selectHandMade;
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;
    @FindBy(css = "input[class='nav-input']")
    WebElement submitBtn;
    //Select departmentDropdown = new Select(dropdownBtn);
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
}
