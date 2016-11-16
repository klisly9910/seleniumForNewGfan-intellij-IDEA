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

    public TestFireFox(WebDriver driver) {
        this.driver = driver;
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
