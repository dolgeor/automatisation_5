package seleniumro.core;

import org.openqa.selenium.WebDriver;

import seleniumro.poms.AddNewPost;
import seleniumro.poms.DashboardPage;
import seleniumro.poms.LeftMenu;
import seleniumro.poms.LoginPage;
import seleniumro.poms.Posts;

public class WordPress {
	private static WordPress wordPress;
	
	public LoginPage loginPage;
	public DashboardPage dashboardPage;
	public LeftMenu leftMenu;
	public Posts posts;
	public AddNewPost addNewPost;
	
	private WordPress(WebDriver driver) {
		loginPage = new LoginPage(driver);
		dashboardPage = new DashboardPage(driver);
		leftMenu = new LeftMenu(driver);
		posts = new Posts(driver);
		addNewPost = new AddNewPost(driver);
		
	}
	
	public static WordPress init(WebDriver driver) {
		if(wordPress==null) {
			wordPress = new WordPress(driver);
		}
		return wordPress;
	}
}
