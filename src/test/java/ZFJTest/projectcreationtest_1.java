package ZFJTest;

import ZFJ.Base.CommonBaseTest;
import ZFJ.Pages.ProjectCreationpage;
import org.testng.annotations.Test;

public class projectcreationtest_1 extends CommonBaseTest {

    ProjectCreationpage projectcreationpage;

    @Test(description = "To create a New project and to give a Project key", priority = 1, groups = {"regression"})
    public void projectcreationtest_1() {
        projectcreationpage = new ProjectCreationpage(driver);

        projectcreationpage.createProject("KGF", "kgf"); // to create a single project




    }
}

