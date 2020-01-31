package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends CommonAPI {
    @FindBy(linkText="Register")
    WebElement registrationLink;
    @FindBy(id="customer.firstName")
    WebElement firstNameBox;
    @FindBy(id="customer.lastName")
    WebElement lastNameBox;
    @FindBy(id="customer.address.street")
    WebElement addressBox;
    @FindBy(id="customer.address.city")
    WebElement cityBox;
    @FindBy(id="customer.address.state")
    WebElement stateBox;
    @FindBy(id="customer.address.zipCode")
    WebElement zipCodeBox;
    @FindBy(id="customer.phoneNumber")
    WebElement phoneNumBox;
    @FindBy(id="customer.ssn")
    WebElement ssnBox;
    @FindBy(id="customer.username")
    WebElement userNameBox;
    @FindBy(id="customer.password")
    WebElement passwordBox;
    @FindBy(id="repeatedPassword")
    WebElement confirmBox;
    @FindBy(xpath = "//input[@type=\"submit\" and @value=\"Log In\"]")
    WebElement registerBtn;
    public void clickOnRegister(){
        registrationLink.click();
    }
    public void registerForAccount(String firstName,String lastName, String address, String city, String state,String zipCode, String phoneNumber,String ssn,String userName,String password){
        clickOnRegister();
        firstNameBox.sendKeys(firstName);
        lastNameBox.sendKeys(lastName);
        addressBox.sendKeys(address);
        cityBox.sendKeys(city);
        stateBox.sendKeys(state);
        zipCodeBox.sendKeys(zipCode);
        phoneNumBox.sendKeys(phoneNumber);
        ssnBox.sendKeys(ssn);
        userNameBox.sendKeys(userName);
        passwordBox.sendKeys(password);
        confirmBox.sendKeys(password);
        registerBtn.click();
    }
}
