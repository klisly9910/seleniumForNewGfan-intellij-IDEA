import org.apache.commons.exec.OS;

/**
 * Created by xiaohua on 11/11 0011.
 */
public class Driver {
    public static Driver driver;

    public static void getDriver(String browser) {
        if (OS.isFamilyDOS()) {
            if (browser.equalsIgnoreCase("firefox")) {
                System.out.println(" Executing on FireFox");
                System.setProperty("webdriver.firefox.marionette",
                        "C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
                // driver = new FirefoxDriver();
                // driver.get(URL);
                // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                // driver.manage().window().maximize();
            } else if (browser.equalsIgnoreCase("chrome")) {
                System.out.println("Executing on CHROME");
                System.setProperty("webdriver.chrome.driver",
                        "C:\\Program Files (x86)\\Google\\chromedriver.exe");
                // driver = new ChromeDriver();
                // driver.get(URL);
                // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                // driver.manage().window().maximize();
            } else if (browser.equalsIgnoreCase("iexplore")) {
                System.out.println("Executing on IE");
                System.setProperty("webdriver.ie.driver",
                        "C:\\Program Files (x86)\\Internet Explorer\\IEDriverServer.exe");
                // driver = new InternetExplorerDriver();
                // driver.get(URL);
                // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                // driver.manage().window().maximize();
            } else {
                throw new IllegalArgumentException("The Browser Type is Undefined");
            }
        } else if (OS.isFamilyMac()) {
                if (browser.equalsIgnoreCase("chrome")) {
                    System.out.println("Executing on CHROME");
                    System.setProperty("webdriver.chrome.driver",
                            "/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
                    // driver = new ChromeDriver();
                    // driver.get(URL);
                    // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    // driver.manage().window().maximize();
                }else if (browser.equalsIgnoreCase("firefox")){
                    System.out.println("Executing on firefox");
                    System.setProperty("webdriver.firefox.driver",
                            "/Applications/Firefox.app/Contents/MacOS/geckodriver");
                } else {
                    throw new IllegalArgumentException("The Browser Type is Undefined");
                }

            }
        }

    }
