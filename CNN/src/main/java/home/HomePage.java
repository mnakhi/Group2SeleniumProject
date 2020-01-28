package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;


public class HomePage extends CommonAPI {

    public void InvokeCNN(){
        driver.get("https://www.cnn.com/");
        driver.manage().window().maximize();
    }
   public void Clicksearch_icon(){
        driver.findElement(By.className("search-icon")).click();
   }

   public void Exitsearch_icon(){
        driver.findElement(By.className("close-icon")).click();
   }





}
