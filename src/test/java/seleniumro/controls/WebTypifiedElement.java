package seleniumro.controls;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import ru.yandex.qatools.htmlelements.element.TypifiedElement;
import seleniumro.core.Helpers;

public class WebTypifiedElement extends TypifiedElement {

	private static final Logger log = LogManager.getLogger(WebTypifiedElement.class);
	
	public WebTypifiedElement(WebElement wrappedElement) {
		super(wrappedElement);
		// TODO Auto-generated constructor stub
	}
	
	public void equals(String str) {
		checkIfDisplayed();
		log.info("Check content coincidence for " + getName());
		Helpers.check2StringIfEquals(this.getText(), str);
	}

	@Override
	public void click() {
		log.info("Click on element " + getName());
		getWrappedElement().click();
	}

	public void checkIfDisplayed() {
		log.info("Element " + getName() + " is displayed");
		Assert.assertTrue(this.isDisplayed(), "Element " + getName() + " is displayed");
	}
}
