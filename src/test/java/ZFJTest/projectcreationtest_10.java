package ZFJTest;


import ZFJ.Base.CommonBaseTest;
import ZFJ.Pages.ProjectCreationpage;
import org.testng.annotations.Test;

public class projectcreationtest_10 extends CommonBaseTest {

    ProjectCreationpage projectcreationpage;

    @Test(description = "To create 10 new projects and assign project keys", priority = 1, groups = {"regression"})
    public void projectcreationtest_10() {
        projectcreationpage = new ProjectCreationpage(driver);
        String[][] projects = {
//                {"Project", "Pro"},
               {"Automation2", "AUTO22"},
//                {"p1", "P1"},
//                {"p2", "P2"},
//                {"p3", "P3"},
//                {"p4", "P4"},
//                {"p5", "P5"},
                {"RahulRajkumar", "RR"},
                {"SurbhiR", "SR"},
                {"Shwetha", "SSR"},
                {"Varun", "VR"},
               // {"MryuthyunjayP", "MP"}
        };

        for (String[] project : projects) {
            projectcreationpage.createProject(project[0], project[1]);
        }
    }
}

