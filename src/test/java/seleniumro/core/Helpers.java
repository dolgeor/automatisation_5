package seleniumro.core;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import seleniumro.controls.WebTypifiedElement;

public class Helpers {

	private static final Logger log = LogManager.getLogger(WebTypifiedElement.class);
	
	public static void click(WebDriver driver, WebElement a, WebElement b) {
		try {
			String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover',true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
			((JavascriptExecutor) driver).executeScript(mouseOverScript, a);
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript(mouseOverScript, b);
			Thread.sleep(1000);
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", b);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void check2StringIfEquals(WebElement el, String str) {
		check2StringIfEquals(el.getText(), str);
	}
	
	public static void check2StringIfEquals(String str1, String str2) {
		log.info("Check 2 strings if equals\n1st:" + str1 + "\n2nd:" + str2);
		Assert.assertEquals(str1, str2, "Check 2 string if equals");
	}
}
