package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class HomePage extends CommonAPI {
    //write methods
        @FindBy(id = "globalSearchInputField")
        WebElement searchBox;
        @FindBy(id = "searchSubmit")
        WebElement searchSubmitBtn;
        @FindBy(id = "unselectedMenuButton")
        WebElement shopByDepartment;

        public void navigateToMacys() {
            driver.get("https://www.macys.com");
        }

        public void searchNClick(String itemName) {
            this.navigateToMacys();
            searchBox.sendKeys("Boots");
            searchSubmitBtn.click();
        }

        public void clickingOnDropdown() {
            shopByDepartment.click();
        }

        public void clickingOnSpecificDepartment(String department) {
            driver.findElement(By.id("shopByDepartmentDropdown")).click();
            driver.findElement(By.linkText(department)).click();
        }
}

