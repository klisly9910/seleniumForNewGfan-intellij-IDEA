import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.jvm.hotspot.utilities.AssertionFailure;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by xiaohua on 11/11 0011.
 */
public class Navigator {
    WebDriver driver;
    DataModel dataModel = ConfigData.getInstance().getDataModel();

    @BeforeMethod
    public void init() {
        Driver.getDriver("chrome");
        driver = new ChromeDriver();
        driver.get("http://www.gfan.com/new/");
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

//    @AfterMethod(enabled = true)
//    public void end() {
//        driver.close();
//        driver.quit();
//    }

    @Test
    public void TestNavigator() {
        driver.findElement(By.xpath(dataModel.getNavigator().getOffice())).click();
        driver.findElement(By.xpath(dataModel.getNavigator().getNewMedia())).click();
        driver.findElement(By.xpath(dataModel.getNavigator().getGame())).click();
        driver.findElement(By.xpath(dataModel.getNavigator().getBbs())).click();
        driver.findElement(By.xpath(dataModel.getNavigator().getComputer())).click();
        driver.findElement(By.xpath(dataModel.getNavigator().getHomeElectric())).click();
        driver.findElement(By.xpath(dataModel.getNavigator().getPhone())).click();
        driver.findElement(By.xpath(dataModel.getNavigator().getSmart())).click();
    }
}
