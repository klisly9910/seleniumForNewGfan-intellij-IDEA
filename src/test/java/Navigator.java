import com.google.common.base.Verify;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by xiaohua on 11/11 0011.
 */
public class Navigator {
    WebDriver driver;
    DataModel dataModel = ConfigData.getInstance().getDataModel();
    By locator = By.partialLinkText(dataModel.getErrorMessage().getNotexit());

    @BeforeMethod
    public void init() {
        Driver.getDriver("chrome");
        driver = new ChromeDriver();
        driver.get("http://www.gfan.com/new/");
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @AfterMethod(enabled = true)
    public void end() {
        driver.close();
        driver.quit();
    }


    @Test
    public void TestNavigator() throws Exception{
        driver.findElement(By.xpath(dataModel.getNavigator().getOffice())).click();
//        Assert.assertEquals(true, driver.findElement(By.xpath(dataModel.getNavigator().getLogo())).isDisplayed());
        isElementExist.doesWebElementExist(driver,locator);
//        System.out.println("1.office logo is exist");

        driver.findElement(By.xpath(dataModel.getNavigator().getNewMedia())).click();
//        Assert.assertEquals(true, driver.findElement(By.xpath(dataModel.getNavigator().getLogo())).isDisplayed());
        isElementExist.doesWebElementExist(driver,locator);
//        System.out.println("1.getNewMedia logo is exist");

        driver.findElement(By.xpath(dataModel.getNavigator().getGame())).click();
//        Assert.assertEquals(true, driver.findElement(By.xpath(dataModel.getNavigator().getLogo())).isDisplayed());
        isElementExist.doesWebElementExist(driver,locator);
//        System.out.println("3.game logo is exist");

        driver.findElement(By.xpath(dataModel.getNavigator().getBbs())).click();
//        Assert.assertEquals(true, driver.findElement(By.xpath(dataModel.getNavigator().getLogo())).isDisplayed());
        isElementExist.doesWebElementExist(driver,locator);
//        System.out.println("4.bbs logo is exist");

        driver.findElement(By.xpath(dataModel.getNavigator().getComputer())).click();
//        Assert.assertEquals(true, driver.findElement(By.xpath(dataModel.getNavigator().getLogo())).isDisplayed());
        isElementExist.doesWebElementExist(driver,locator);
//        System.out.println("5.computer logo is exist");

        driver.findElement(By.xpath(dataModel.getNavigator().getHomeElectric())).click();
//        Assert.assertEquals(true, driver.findElement(By.xpath(dataModel.getNavigator().getLogo())).isDisplayed());
        isElementExist.doesWebElementExist(driver,locator);
//        System.out.println("6.home logo is exist");

        driver.findElement(By.xpath(dataModel.getNavigator().getPhone())).click();
//        Assert.assertEquals(true, driver.findElement(By.xpath(dataModel.getNavigator().getLogo())).isDisplayed());
        isElementExist.doesWebElementExist(driver,locator);
//        System.out.println("7.phone logo is exist");

        driver.findElement(By.xpath(dataModel.getNavigator().getSmart())).click();
//        Assert.assertEquals(true, driver.findElement(By.xpath(dataModel.getNavigator().getLogo())).isDisplayed());
        isElementExist.doesWebElementExist(driver,locator);
//        System.out.println("8.smart logo is exist");
    }

    @Test(enabled = false)
    public void footer() throws Exception{
//        driver.findElement(By.xpath(dataModel.getFooter().getFooterlogo())).click();
//        driver.switchTo().window(SwitchToWindow.currentWindow);
        List<WebElement> topurl = driver.findElements(By.xpath(dataModel.getFooter().getFootertop()));
        Assert.assertEquals(14, topurl.size());
        System.out.println("topurl size:" + topurl.size());
        for (int i = 0; i < topurl.size(); i++) {
            String url = topurl.get(i).getAttribute("href");
            System.out.println("url:" + i + url);
            topurl.get(i).click();
            SwitchToWindow.switchToWindow(driver);
            isElementExist.doesWebElementExist(driver,locator);
            Assert.assertEquals(true, SwitchToWindow.window.getCurrentUrl().contains("gfan.com"));
//            Assert.assertEquals(SwitchToWindow.window.getCurrentUrl().substring(SwitchToWindow.window.getCurrentUrl().indexOf("//")), url.substring(url.indexOf("//")));
            driver.switchTo().window(SwitchToWindow.currentWindow);
        }
    }
}
