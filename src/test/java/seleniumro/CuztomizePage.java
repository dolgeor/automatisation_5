package seleniumro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CuztomizePage {

	WebDriver driver;
	@FindBy(xpath = "//div[@id='customize-info']/div/span")
	public WebElement pageName;
	
	public CuztomizePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
