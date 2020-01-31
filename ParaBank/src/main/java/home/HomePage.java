package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {


    @FindBy (xpath = "//*[@id=\"headerPanel\"]/ul[1]/li[2]/a")
    WebElement abtUsBtn;
}

