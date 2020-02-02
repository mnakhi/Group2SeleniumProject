package online;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BillPayTest extends CommonAPI {
    @Test
    public void testUserCanPayTheirBillOnline() {
        BillPay billPay = PageFactory.initElements(driver, BillPay.class);
        billPay.billPay();
    }
    @Test
    public void testUserCanSeeTheirAccountHistory() {
        BillPay billPay = PageFactory.initElements(driver, BillPay.class);
        billPay.accountHistory();
    }
    @Test
    public void testUserCanTransferFunds() {
        BillPay billPay = PageFactory.initElements(driver, BillPay.class);
        billPay.transferFunds();
    }
}
