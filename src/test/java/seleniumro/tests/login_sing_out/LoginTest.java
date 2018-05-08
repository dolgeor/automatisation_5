package seleniumro.tests.login_sing_out;

import org.testng.annotations.Test;

import seleniumro.core.BaseTest;
import seleniumro.core.WordPress;

@Test
public class LoginTest extends BaseTest {
	
	public void test(){
		WordPress wp = WordPress.init(driver);
		
		wp.loginPage.login("admin", "admin_pass!");
		wp.dashboardPage.pageTitle.equals("Dashboard");
		wp.dashboardPage.welcomeMsg.equals("Welcome to WordPress!");
	}
}
