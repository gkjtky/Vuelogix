package testpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import basepkg.BaseClass;
import pagepkg.TNSTChomePage;
import pagepkg.TNSTCloginpage;
import pagepkg.UserHome;

public class TNSTClogin extends BaseClass{
	@Test
	public void test()
	{
		TNSTChomePage obHome= new TNSTChomePage(driver);
		TNSTCloginpage obLogin= new TNSTCloginpage(driver);
		UserHome obLogout = new UserHome(driver);
		obHome.navigationLogin();
		obLogin.setValues("josephgeorge22@yahoo.com", "Oranges@1234");
		obLogin.loginClick();
		obLogout.navigationLogout();
	}
	@AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);  // Wait for 10 seconds
        driver.quit(); // Close the browser
    }
}

