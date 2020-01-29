package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

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
              "776B-F168-D79B-ED35F5FB6488']//a//img[@class='media__image media__image--responsive']")).click();
    }
    public void searchAmerica(){
        driver.findElement(By.className("search-icon")).click();
        driver.findElement(By.xpath("//input[@id='header-search-bar']")).sendKeys("Kobe");
        driver.findElement(By.xpath("//div[@class='Box-sc-1fet97o-0 iKQPmQ']//button[@class='Flex-sc-1sqrs56-0 search-barstyles__Button-yoe3fw-2 kxpkSG']")).click();
    }
    public void USbutton(){
        driver.findElement(By.id("left_us")).click();
    }
    public void PoliticsButton(){
        driver.findElement(By.id("left_world")).click();
    }
    public void BusinessButton(){
        driver.findElement(By.id("left_politics")).click();
    }
    public void OpinoinButton(){
        driver.findElement(By.id("left_opinion")).click();
    }
    public void HealthButton(){
        driver.findElement(By.id("left_health")).click();
    }
    public void EntertainButton(){
        driver.findElement(By.id("left_entertainment")).click();
    }
    public void StyleButton(){
        driver.findElement(By.id("left_style")).click();
    }
  public void TravelButton(){
        driver.findElement(By.id("left_travel")).click();
    }



}

