package seleniumro.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import seleniumro.controls.WebLink;
import seleniumro.controls.WebTextBlock;
import seleniumro.core.AbstractPOM;

public class Users extends AbstractPOM {

	public Users(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//h1[contains(text(),'Users')]")
	public WebTextBlock pageTitle;
	
	@FindBy(xpath = "//h1/a[text()='Add New']")
	public WebLink addNewLnk;

}
