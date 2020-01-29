package home;

import common.CommonAPI;
import org.openqa.selenium.By;

public class HomePage extends CommonAPI {
    //write methods
    public void InvokeCNN(){
        driver.get("https://www.cnn.com/");
        driver.manage().window().maximize(); // comment
    }
    public void Clicksearch_icon(){
        driver.findElement(By.className("search-icon")).click();
    }

    public void Exitsearch_icon(){
        driver.findElement(By.className("close-icon")).click();
    }


    public void  clickMedia(){
        driver.findElement(By.xpath("//ul[@class='cn cn-list-hierarchical-xs cn--idx-0 cn-container_0338BCBB-" +
              "776B-F168-D79B-ED35F5FB6488']//a//img[@class='media__image media__image--responsive']")).click();//
    }

    public void searchAmerica(){
        driver.findElement(By.className("search-icon")).click();
        driver.findElement(By.xpath("//input[@id='header-search-bar']")).sendKeys("America");
        driver.findElement(By.xpath("//div[@class='Box-sc-1fet97o-0 kJrFkT']//*[@class='search-icon']")).sendKeys();
    }


}

