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
}
