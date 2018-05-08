package seleniumro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostsPage {

	WebDriver driver;
	@FindBy(xpath = "//div[@class='wrap']/h1")
	public WebElement pageName;
	
	public PostsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
