package ZFJ.Base;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class CommonBaseTest {
    public static WebDriver driver;

     String baseUrl ="http://localhost:1031/";


@BeforeTest
    public void setUp() {
     WebDriverManager.chromedriver().setup();

    driver = new ChromeDriver();
//*  ChromeOptions options = new ChromeOptions();
   // options.addArguments("--headless"); // Add headless mode argument
    //options.addArguments("disable-infobars");
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    driver.manage().window().maximize();
    driver.navigate().refresh();
    driver.manage().deleteAllCookies();
   // ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
    driver.get(baseUrl);


//    WebDriverManager.chromedriver().setup();
//    ChromeOptions options = new ChromeOptions();
//    options.addArguments("--headless"); // Add headless mode argument
//    options.addArguments("disable-infobars");
//    WebDriver driver = new ChromeDriver(options);
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    driver.manage().window().maximize();
//    driver.navigate().refresh();
//    driver.manage().deleteAllCookies();
//    driver.get(baseUrl);


}

@AfterTest
    public void teardown()
{
    driver.quit();
}
}
