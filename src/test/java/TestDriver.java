import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by klisly on 16/11/2016.
 */
public class TestDriver {
    TestFireFox testFireFox;
    WebDriver driver;

    @BeforeMethod
    public void init() {
        Driver.getDriver("firefox");
        driver = new FirefoxDriver();
//        Driver.getDriver("chrome");
//        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        testFireFox = new TestFireFox(driver);
    }

    @Test
    public void test() {
        testFireFox.goToo();
    }

    @AfterMethod(enabled = true)
    public void end() {
        driver.close();
        driver.quit();
    }
}
