package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HamburgerFunctions extends CommonAPI {
    @FindBy(id = "nav-hamburger-menu")
    WebElement hamburgerIcon;
    @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[34]/li[2]/a")
    WebElement primeBtn;
    public void c(){
        hamburgerIcon.click();
        primeBtn.click();
    }
}
