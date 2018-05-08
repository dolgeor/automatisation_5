package seleniumro.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import ru.yandex.qatools.htmlelements.element.TextBlock;
import seleniumro.controls.WebTextBlock;
import seleniumro.core.AbstractPOM;

public class Posts extends AbstractPOM{
	
	public Posts(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//div[@class='wrap']/h1")//[text()='Posts']")
	public WebTextBlock pageNameLabel;
	
}
