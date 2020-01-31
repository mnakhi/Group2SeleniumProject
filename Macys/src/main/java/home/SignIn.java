package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class SignIn extends CommonAPI {
    @FindBy(id = "myRewardsLabel");
    WebElement signIn;
    }

}
