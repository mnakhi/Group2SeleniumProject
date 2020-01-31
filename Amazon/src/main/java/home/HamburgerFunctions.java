package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HamburgerFunctions extends CommonAPI {
    @FindBy(id = "nav-hamburger-menu")
    WebElement hamburgerIcon;
    @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[34]/li[2]/a")
    WebElement primeBtn;
    @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[34]/li[4]/a")
    WebElement echoNAlexaBtn;
    @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[1]/a")
    WebElement mainMenuBtn;
    public void primeVideoOption()  {
        hamburgerIcon.click();
        primeBtn.click();
        mainMenuBtn.click();
    }
    public void EchoOption()  {
        hamburgerIcon.click();
        echoNAlexaBtn.click();
        mainMenuBtn.click();
    }
}
