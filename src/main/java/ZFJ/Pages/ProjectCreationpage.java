package ZFJ.Pages;

import ZFJ.Base.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectCreationpage {
    private static final Logger log = LoggerFactory.getLogger(ProjectCreationpage.class);
    private static WebDriver driver;
    CommonUtils bp;
    private By projectcreationlinkbtn =By.xpath("//a[@id='browse_link']") ;

    private By createprojectbtn = By.xpath("//a[@id='project_template_create_link_lnk']");

    private By scrumsoftwaredevelopmentbtn = By.xpath("//div[@title='Agile development with a board, sprints and stories. Connects with source and build tools.']");

    private By nextbtn = By.xpath("//button[@class='create-project-dialog-create-button pt-submit-button aui-button aui-button-primary']");

    private By selectbtn = By.xpath("//button[@class='template-info-dialog-create-button pt-submit-button aui-button aui-button-primary']");

    private By projectName = By.xpath("//input[@id='name']");

    private By projectkey = By.xpath("//input[@id='key']");

    private By submitbtn = By.xpath("//button[@class='add-project-dialog-create-button pt-submit-button aui-button aui-button-primary']");

    public ProjectCreationpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(ProjectCreationpage.driver,this);
    }

    public void createProject(String name, String key) throws InterruptedException {
        driver.findElement(projectcreationlinkbtn).click();
        bp.waitforelement();
        log.info("clicked project creation button");

        driver.findElement(createprojectbtn).click();
        bp.waitforelement();
        log.info("clicking the project creation button");

        driver.findElement(scrumsoftwaredevelopmentbtn).click();
        bp.waitforelement();
        log.info("clicking the project creation scrum software development button");

        driver.findElement(nextbtn).click();
        bp.waitforelement();
        log.info("clicking Next button");

        driver.findElement(selectbtn).click();
        bp.waitforelement();
        log.info("clicking the select button");

        driver.findElement(projectName).clear();
        bp.waitforelement();
        log.info("clearing project name text box");

        driver.findElement(projectName).sendKeys(name);
        bp.waitforelement();
        log.info("Entering project name");

        driver.findElement(projectkey).clear();
        bp.waitforelement();
        log.info("clearing project key text box");

        driver.findElement(projectkey).sendKeys(key);
        bp.waitforelement();
        log.info("Entering project key");

        driver.findElement(submitbtn).click();
        bp.waitforelement();
        log.info("clicking submit button");

    }


}
