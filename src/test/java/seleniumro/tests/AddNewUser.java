package seleniumro.tests;

import org.testng.annotations.Test;

import seleniumro.core.BaseTest;
import seleniumro.poms.DashboardPage;
import seleniumro.poms.LeftMenu;
import seleniumro.poms.LoginPage;
import seleniumro.poms.Users;
@Test
public class AddNewUser extends BaseTest {
	
	public void test() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		lp.login("admin", "admin_pass!");
		
		DashboardPage dp = new DashboardPage(driver);
		dp.pageTitle.checkIfDisplayed();
		
		LeftMenu lm = new LeftMenu(driver);
		lm.usersLnk.click();
		
		Users users = new Users(driver);
		users.pageTitle.checkIfDisplayed();
		users.addNewLnk.click();
		
		Thread.sleep(2000);
	}
}
