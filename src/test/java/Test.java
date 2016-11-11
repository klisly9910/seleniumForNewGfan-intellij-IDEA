import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.remote.server.handler.SwitchToFrame;
import org.openqa.selenium.remote.server.handler.SwitchToParentFrame;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by xiaohua on 11/10 0010.
 */
public class Test {
    WebDriver driver;
    @BeforeClass
    public  void init(){
//        System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\chromedriver.exe");
//        driver = new ChromeDriver();
        System.setProperty("webdriver.firefox.marionette","C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterClass
    public void end(){
        driver.close();
        driver.quit();
    }
    @org.testng.annotations.Test
    public void TestMainPage() throws InterruptedException{

        driver.get("http://www.gfan.com/new/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("links number :" + links.size());
        for (int i = 1;i<links.size()-1;i++){
            String link = links.get(i).getAttribute("href");
            System.out.println("link " + i + ":" + link);
            links.get(i).click();
            WebElement closeButton =  driver.findElement(By.xpath("/html/body/div[10]/i"));
            if (closeButton.isDisplayed()){
                closeButton.click();
                continue;
            }
            Thread.sleep(1000);
            WebElement loginText = driver.findElement(By.xpath("html/body/div[3]/div[1]/div/h2"));
            if(loginText.isDisplayed()){
                Login.login(driver,"imopan501","123456");
                Thread.sleep(5000);
                continue;
            }
            String parentWindow = driver.getWindowHandle();
            System.out.println("parentWindow:" +parentWindow);
            Set<String> allWindow = driver.getWindowHandles();
            Iterator<String> iterator = allWindow.iterator();
            while (iterator.hasNext()){
                String handle = iterator.next();
                if (handle.equals(parentWindow)){
                        continue;
                    }
                    driver.switchTo().window(handle);//跳转到新窗口
                }
            Thread.sleep(1000);
            driver.close();
            driver.switchTo().window(parentWindow);
             }
                }

    }


