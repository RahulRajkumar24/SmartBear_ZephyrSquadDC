package ZFJTest;

import ZFJ.Base.CommonBaseTest;
import ZFJ.Base.CommonUtils;
import ZFJ.Pages.Loginpage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Loginpagetest extends CommonBaseTest {

    Loginpage loginpage;
    CommonUtils bp;

    @Test(description = "Verify admin can able to login " ,priority = 1, groups = {"regression"})
    public  void loginpagetest() throws InterruptedException {
        loginpage=new Loginpage(driver);
        loginpage.login("Admin", "password");
        Assert.assertTrue(loginpage.equals(loginpage));
        // Assert.assertTrue(loginpage.equals("login"));


    }

}
