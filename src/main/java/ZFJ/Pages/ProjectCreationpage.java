package ZFJ.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectCreationpage {
    private static final Logger log = LoggerFactory.getLogger(ProjectCreationpage.class);
    private static WebDriver driver;

    private By projectcreationlinkbtn =By.xpath("//a[@id='browse_link']") ;

    private By createprojectbtn = By.xpath("//a[@id='project_template_create_link_lnk']");

    private By scrumsoftwaredevelopmentbtn = By.xpath("//div[@title='Agile development with a board, sprints and stories. Connects with source and build tools.']");

    private By nextbtn = By.xpath("//button[@class='create-project-dialog-create-button pt-submit-button aui-button aui-button-primary']");

    private By selectbtn = By.xpath("//button[@class='template-info-dialog-create-button pt-submit-button aui-button aui-button-primary']");

    private By projectName = By.xpath("//input[@id='name']");

    private By projectkey = By.xpath("//input[@id='key']");

    private By sumbitbtn = By.xpath("//button[@class='add-project-dialog-create-button pt-submit-button aui-button aui-button-primary']");

    public ProjectCreationpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(ProjectCreationpage.driver,this);
    }

    public void createProject(String name, String key) {
        driver.findElement(projectcreationlinkbtn).click();
        log.info("clicked project creation button");
        driver.findElement(createprojectbtn).click();
        driver.findElement(scrumsoftwaredevelopmentbtn).click();
        driver.findElement(nextbtn).click();
        driver.findElement(selectbtn).click();
        driver.findElement(projectName).clear();
        driver.findElement(projectName).sendKeys(name);
        driver.findElement(projectkey).clear();
        driver.findElement(projectkey).sendKeys(key);
        driver.findElement(sumbitbtn).click();
    }


}
