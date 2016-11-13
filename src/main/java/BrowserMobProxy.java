import org.browsermob.core.har.Har;
import org.browsermob.proxy.ProxyServer;
import org.browsermob.proxy.jetty.util.TestCase;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.File;


/**
 * Created by klisly on 12/11/2016.
 */
public class BrowserMobProxy extends TestCase{

     static WebDriver driver;

    public BrowserMobProxy(String testCase) {
        super(testCase);
    }
    @Test
    public  static void testGfan() throws Exception{
        ProxyServer server =  new ProxyServer(9090);
        server.start();
        Proxy proxy = server.seleniumProxy();
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PROXY,proxy);

        Driver.getDriver("chrome");
        driver = new ChromeDriver(capabilities);
        server.newHar("gfan.com");
        driver.get("http://www.gfan.com/new/");
        Har har = server.getHar();
//        File file = new File("/Users/klisly/workspace/seleniumForNewGfan-intellij-IDEA/HAR-gfan.com.json");
        String filePath = "/Users/klisly/workspace/seleniumForNewGfan-intellij-IDEA/gfan.com.json";
        File fileGfan = new File(filePath);
        har.writeTo(fileGfan);
        server.stop();
        driver.quit();

    }

}
