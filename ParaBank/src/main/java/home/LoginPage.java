package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonAPI {
    @FindBy(linkText = "Forgot login info?")
    WebElement forgotLoginLink;
    @FindBy(xpath = "//input[@type='text' and @name='username']")
    WebElement userNameBox;
    @FindBy(xpath = "//input[@type='password' and @name='password']")
    WebElement passWordBox;
    @FindBy(xpath = "//input[@type='submit' and @value='Log In']")
    WebElement submitBtn;
    @FindBy(id="firstName")
    WebElement firstNameBox;
    @FindBy(id="lastName")
    WebElement lastNameBox;
    @FindBy(id="address.street")
    WebElement addressStrtBox;
    @FindBy(id="address.city")
    WebElement addressCityBox;
    @FindBy(id="address.state")
    WebElement addressStateBox;
    @FindBy(id="address.zipCode")
    WebElement zipCodeBox;
    @FindBy(id="ssn")
    WebElement ssnBox;
    @FindBy(xpath = "//input[@type='submit' and @value='Find My Login Info']")
    WebElement findLoginInfoBtn;
    public void login(String name, String password){
        userNameBox.sendKeys(name);
        passWordBox.sendKeys(password);
        submitBtn.click();
    }
    public void clickOnForgotLogin(){
        forgotLoginLink.click();
    }
    public void provideInfoForForgetLogin(String firstName, String lastName,String street,String city, String state,String zipCode,String ssn){
        clickOnForgotLogin();
        firstNameBox.sendKeys(firstName);
        lastNameBox.sendKeys(lastName);
        addressStrtBox.sendKeys(street);
        addressCityBox.sendKeys(city);
        addressStateBox.sendKeys(state);
        zipCodeBox.sendKeys(zipCode);
        ssnBox.sendKeys(ssn);
        forgotLoginLink.click();
    }
}
