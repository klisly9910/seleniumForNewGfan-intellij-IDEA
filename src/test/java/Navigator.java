import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
        driver.get("http://www.gfan.com/new/");
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @AfterMethod(enabled = true)
    public void end() {
        driver.close();
        driver.quit();
    }

    public void TestNavigator() throws Exception {
        String data = FileUtils.readFileToString(new File("mainpage.json"), "UTF-8");
        JSONObject jsonObject = new JSONObject(data);
        String phone = jsonObject.getJSONObject("MainPage").getString("phone");
        String computer = jsonObject.getJSONObject("MainPage").getString("computer");
        String smart = jsonObject.getJSONObject("MainPage").getString("smart");
        String homeElectric = jsonObject.getJSONObject("MainPage").getString("homeElectric");
        String office = jsonObject.getJSONObject("MainPage").getString("office");
        String game = jsonObject.getJSONObject("MainPage").getString("game");
        String bbs = jsonObject.getJSONObject("MainPage").getString("bbs");
        String newMedia = jsonObject.getJSONObject("MainPage").getString("newMedia");

        WebElement ephone = driver.findElement(By.xpath(phone));
        ephone.click();





    }
}
