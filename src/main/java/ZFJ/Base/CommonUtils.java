package ZFJ.Base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CommonUtils {
    public WebDriver driver = null;
            public CommonUtils(WebDriver driver) {
                this.driver = driver;
            }
    public void ImplicitWait(int seconds) {
                driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    public boolean waitforelement() throws InterruptedException {
    Thread.sleep(5000);
    return true;
    }


   public boolean explicitWait(WebElement ele){

       try {
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Set timeout to 10 seconds
           wait.until(ExpectedConditions.visibilityOf(ele)); // Wait until the element is visible
           return true; // Return true if the element becomes visible within the timeout
       } catch (Exception e) {
           System.out.println("Element not visible within the timeout: " + e.getMessage());
           return false; // Return false if the element is not visible within the timeout
       }
   }





}
