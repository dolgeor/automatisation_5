package seleniumro.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import seleniumro.controls.WebLink;
import seleniumro.core.AbstractPOM;

public class LeftMenu extends AbstractPOM{
	
	public LeftMenu(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//div[@id='adminmenuwrap']/ul/li/a[./div[contains(text(),'Posts')]]")
	public WebLink postsLnk;
	
	@FindBy(xpath = "//li[a/div[text()='Posts']]/ul/li/a[text()='Add New']")
	public WebLink addNewPostLnk;
	
	@FindBy(xpath = "//div[@id='adminmenuwrap']/ul/li[a/div[text()='Posts']]/ul/li/a[contains(text(),'Add New')]")
	public WebLink addNewPostNotHoverLnk;
	
	@FindBy(xpath = "//li[a/div[text()='Users']]")
	public WebLink usersLnk;
	
//	@FindBy(xpath = "//div[@id='adminmenuwrap']/ul/li[./a/div[contains(text(),'Posts')]]/ul/li/a[text()='All Posts']")
//	public WebElement allPostsLnk;
//	
//	@FindBy(xpath = "//div[@id='adminmenuwrap']/ul/li[./a/div[contains(text(),'Posts')]]/ul/li/a[text()='Add New']")
//	public WebElement addNewLnk;
	

}
