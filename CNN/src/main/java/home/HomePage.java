package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends CommonAPI {

    //write methods

    public void InvokeCNN() {
        driver.get("https://www.cnn.com/");
        driver.manage().window().maximize(); // comment
    }

    public void Clicksearch_icon() {
        driver.findElement(By.className("search-icon")).click();
    }

    public void Exitsearch_icon() {
        driver.findElement(By.className("close-icon")).click();
    }

    public void clickMedia() {
        driver.findElement(By.xpath("//ul[@class='cn cn-list-hierarchical-xs cn--idx-0 cn-container_0338BCBB-" +
                "776B-F168-D79B-ED35F5FB6488']//a//img[@class='media__image media__image--responsive']")).click();
    }

    public void searchAmerica() {
        driver.findElement(By.className("search-icon")).click();
        driver.findElement(By.xpath("//input[@id='header-search-bar']")).sendKeys("Kobe");
        driver.findElement(By.xpath("//div[@class='Box-sc-1fet97o-0 iKQPmQ']//button[@class='Flex-sc-1sqrs56-0 search-barstyles__Button-yoe3fw-2 kxpkSG']")).click();
    }

    public void USbutton() {
        driver.findElement(By.xpath("//label[contains(text(),'US')]")).click();
    }

    public void WorldButton() {
        driver.findElement(By.xpath("//label[contains(text(),'World')] "));
    }

    public void PoliticsButton() {
        driver.findElement(By.xpath("//div[@class='cnn-search__left']//li[4]//label[1]")).click();
    }

    public void BusinessButton() {
        driver.findElement(By.xpath("//label[contains(text(),'Business')]")).click();
    }

    public void OpinionButton() {
        driver.findElement(By.xpath("//label[contains(text(),'Opinions')]")).click();
    }

    public void HealthButton() {
        driver.findElement(By.xpath("//li[7]//label[1]")).click();
    }

    public void EntertainButton() {
        driver.findElement(By.xpath("//li[8]//label[1]")).click();
    }

    public void StyleButton() {
        driver.findElement(By.xpath("//li[9]//label[1]")).click();
    }

    public void TravelButton() {
        driver.findElement(By.xpath("//label[contains(text(),'Travel')]")).click();
    }

    public void AllCNNButton() {
        driver.findElement(By.xpath("//label[contains(text(),'All CNN')]")).click();
    }

    public void Storiestab() {
        driver.findElement(By.xpath("//label[contains(text(),'Stories')]")).click();
    }

    public void VideosTab() {
        driver.findElement(By.xpath("//label[contains(text(),'Videos')]")).click();
    }

    public void PhotosTab() {
        driver.findElement(By.xpath("//label[contains(text(),'Photos')]")).click();
    }

    public void DropDown(){
        driver.findElement(By.xpath("//ul[@class='n_search-drop facet_list sortOptions']")).click();
        driver.findElement(By.xpath("//li[@id='newest'] ")).click();
    }

    public void ClearSearcg(){
        driver.findElement(By.xpath("//button[@class='cnn-search__clear']")).click();

    }


}

