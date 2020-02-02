package online;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillPay extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"rightPanel\"]/ul[2]/li[2]/a")
    WebElement billPayBtn;
    @FindBy(xpath = "//*[@id=\"rightPanel\"]/ul[2]/li[3]/a")
    WebElement accountHistoryBtn;
    @FindBy(xpath = "//*[@id=\"rightPanel\"]/ul[2]/li[4]/a")
    WebElement transferFundsBtn;

    public void billPay(){
        billPayBtn.click();
    }
    public void accountHistory(){
        accountHistoryBtn.click();
    }
    public void transferFunds(){
        transferFundsBtn.click();
    }
}
