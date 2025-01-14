import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Zephyr_Login_PR {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://localhost:9033");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='login-form-username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='login-form-password']")).sendKeys("password");
        driver.findElement(By.xpath("//button[@id='login-form-submit']")).click();

        //Thread.sleep(30);
        driver.quit();
    }
    }

