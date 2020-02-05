package search;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MoreSearchTest extends CommonAPI {
    @Test
    public void testUserCanSelectAudibleOptionFromDepartmentsDropdownNSearch() throws InterruptedException {
        MoreSearch moreSearch = PageFactory.initElements(driver, MoreSearch.class);
        moreSearch.selectAudibleOption("Stephen King");
    }
    @Test
    public void testUserCanSelectHandMadeOptionsFromDepartmentsDropdownNSearch() throws InterruptedException {
        MoreSearch moreSearch = PageFactory.initElements(driver, MoreSearch.class);
        moreSearch.selectAudibleOption("Mat");
    }
}
