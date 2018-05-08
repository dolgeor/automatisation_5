package seleniumro.core;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

	private static final Logger log = LogManager.getLogger(BaseTest.class);
	
	protected static WebDriver driver;
	
	@BeforeClass
	public void setup(){
		DOMConfigurator.configure("src/main/resources/log4j-config.xml");
		log.info("");
		log.info("");
		log.info("");
		log.info(getClass().getSimpleName());
		log.info("Open browser");
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://testing.webtic.info/wordpress/wp-login.php";
		log.info("Navigate to: " + url);
		driver.get(url);
	}
	
	@AfterClass
	public void close(){
		takeScreenshot();
		driver.quit();
	}
	
	public static void takeScreenshot(){
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		LocalDateTime timePoint = LocalDateTime.now();
		String name = "tests-info/screens/screenshot "  + timePoint.get(ChronoField.YEAR_OF_ERA) + "-" + timePoint.getMonth() + "-" + timePoint.getDayOfMonth() + "|"+ timePoint.getHour() + "-" + timePoint.getMinute() + "-" + timePoint.getSecond() + ".png";
		File DestFile=new File(name);
		log.info("Screenshot name is " + name);
        try {
			FileUtils.copyFile(SrcFile, DestFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
