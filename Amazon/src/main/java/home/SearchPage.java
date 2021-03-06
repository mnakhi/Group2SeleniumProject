package home;

import datasuply.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SearchPage {

    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS, using = ".nav-input")
    public static WebElement submitWebElement;

    public static WebElement getSearchInputWebElement(){
        return searchInputWebElement;
    }
    public static WebElement getSubmitWebElement(){
        return submitWebElement;
    }

    public void clearInputBox(){
        getSearchInputWebElement().clear();
    }

    public void typeItemName(String value){
        getSearchInputWebElement().sendKeys(value);
    }

    public void clickOnSearch(){
        getSubmitWebElement().click();
    }

    public void clearTypeNClickOnSearch(){
        List<String> list = getItems();
        for(int i=0;i<list.size(); i++) {
            clearInputBox();
            typeItemName(list.get(i));
            clickOnSearch();
        }

    }

    public void searchItemsAndSubmitButton()throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = DataSource.getItemsListFromDB();
        for(int i=0; i<list.size(); i++) {
            typeItemName(list.get(i));
            clickOnSearch();
            clearInputBox();
        }
    }
    public static List<String> getItems(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("books");
        itemsList.add("iPhone");
        itemsList.add("Honey");
        itemsList.add("car");
        itemsList.add("earphone");

        return itemsList;

    }
    public void searchFromList(){
        List<String> list = SearchPage.getItems();
        for (String s: list) {
            typeItemName(s);
            clickOnSearch();
            clearInputBox();
        }
    }

}