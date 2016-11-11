import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by xiaohua on 11/11 0011.
 */
public class Navigator {
    WebDriver driver;

    @BeforeMethod
    public void init() {
        Driver.getDriver("firefox");
        driver = new FirefoxDriver();
//        Driver.getDriver("chrome");
//        driver = new ChromeDriver();
//        driver.get("http://www.gfan.com/new/");
        driver.get("http://www.baidu.com");
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @AfterMethod(enabled = true)
    public void end() {
        driver.close();
        driver.quit();
    }
    @Test
    public void TestNavigator() throws Exception {
//        String ephone = ConfigData.getInstance().getPhone();
//        System.out.println("ephone:" + ephone);
//        WebElement phone = driver.findElement(By.xpath(ephone));
//        phone.click();
        String id = ConfigData.getInstance().getId();
        System.out.println("id = " + id);
        WebElement ID = driver.findElement(By.id(id));
        ID.sendKeys("maven");
        driver.findElement(By.id(ConfigData.getInstance().getButton())).click();


    }
}
