
import com.google.gson.JsonObject;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

/**
 * Created by xiaohua on 11/10 0010.
 */
public class Search {
//    static WebDriver driver;
    static WebElement searchButton;
    static  WebElement closeButton;
    public static void testSearch(WebDriver driver){
        searchButton = driver.findElement(By.xpath(".//*[@id='nav-top']/div[2]/div/a[1]"));
        searchButton.click();
        closeButton = driver.findElement(By.xpath("/html/body/div[10]/i"));
        closeButton.click();


}


}
