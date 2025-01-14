package ZFJ.Pages;

import ZFJ.Base.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Loginpage {
    private static final Logger log = LoggerFactory.getLogger(Loginpage.class);
    private static WebDriver driver;
    public CommonUtils bp;



    private By usernameTextbox = By.xpath("//input[@id='login-form-username']");

    private By passwordTextbox = By.xpath("//input[@id='login-form-password']");

    private By loginsidebutton = By.xpath("//a[@class='aui-nav-link login-link']");

    private By loginButton = By.xpath("//input[@id='login']");

    private By loginSymbol =By.xpath("//a[@class='aui-nav-link login-link']");

    // Constructor
    public Loginpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(Loginpage.driver, this);
      //if we give PageFactory @FindBy can be initialized
    }

    public void login(String username, String password) throws InterruptedException {
        // Perform login actions using the provided username and password

       driver.findElement(loginsidebutton).click();
        bp.waitforelement();
        log.info("login side button is clicked");

        driver.findElement(usernameTextbox).clear();
        bp.waitforelement();
        log.info("user name text box is cleard");
        driver.findElement(usernameTextbox).sendKeys(username);
        bp.waitforelement();
        log.info("user name text box is clicked");

        driver.findElement(passwordTextbox).clear();
        bp.waitforelement();
        log.info("password text box is cleared");

        driver.findElement(passwordTextbox).sendKeys(password);
        bp.waitforelement();
        log.info("password text box is clicked");

        driver.findElement(loginButton).click();
        bp.waitforelement();
        log.info("login button  is clicked");


        driver.findElement(loginSymbol).isDisplayed();
        bp.waitforelement();
        log.info("logged in  Symbol  is clicked");


    }
}
