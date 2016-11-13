import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

/**
 * Created by klisly on 12/11/2016.
 */
public class isElementExist {
    public static boolean doesWebElementExist(WebDriver driver, By selector) throws Exception{

        try {
            driver.findElement(selector);
            System.out.print("url is error");
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("url is correct!");
            return false;
        }
    }
}
