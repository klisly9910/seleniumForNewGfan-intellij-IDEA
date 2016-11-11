import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by xiaohua on 11/10 0010.
 */
public class Login {
    //login method
    public static void login(WebDriver driver,String username,String password) throws InterruptedException{
        driver.findElement(By.id("loginName")).clear();
        driver.findElement(By.id("loginName")).sendKeys(username);
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys(password);
        Scanner readline = new Scanner(System.in);
        System.out.println("请输入验证码：");
        String authcode = readline.nextLine();
        driver.findElement(By.id("authCode")).sendKeys(authcode);
        driver.findElement(By.id("regInputBt")).click();
        Thread.sleep(5000);
    }
}
