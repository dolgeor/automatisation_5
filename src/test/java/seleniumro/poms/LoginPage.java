package seleniumro.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextBlock;
import ru.yandex.qatools.htmlelements.element.TextInput;
import seleniumro.controls.WebButton;
import seleniumro.controls.WebTextBlock;
import seleniumro.controls.WebTextInput;
import seleniumro.controls.WebTypifiedElement;
import seleniumro.core.AbstractPOM;

public class LoginPage extends AbstractPOM{

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='user_login']")
	public WebTextInput userNameInput;
	
	@FindBy(id = "user_pass")
	public WebTextInput userPassInput;
	
	@FindBy(id = "wp-submit")
	public WebButton submitBtn;
	
	@FindBy(xpath = "//div[@id='login_error']")
	public WebTextBlock errorMsg;
	
	public void login(String strUserName, String strPasword) {
		userNameInput.sendKeys(strUserName);
		userPassInput.sendKeys(strPasword);
		submitBtn.click();
	}
}