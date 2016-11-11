import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


/**
 * Created by xiaohua on 11/11 0011.
 */
public class TestFireFox {
    WebDriver driver;
    @BeforeMethod
    public void init(){
        Driver.getDriver("firefox");
        driver = new FirefoxDriver();
//        Driver.getDriver("chrome");
//        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @AfterMethod(enabled = true)
    public void end(){
        driver.close();
        driver.quit();
    }
    @Test
    public void test(){
        driver.get("http://www.baidu.com");
        driver.findElement(By.id("kw")).sendKeys("maven");
        driver.findElement(By.id("su")).click();
    }
    @Test
    public void goToo(){
        driver.get("http://www.baidu.com");
        driver.findElement(By.id("kw")).sendKeys("selenium");
        driver.findElement(By.id("su")).click();
    }
}
