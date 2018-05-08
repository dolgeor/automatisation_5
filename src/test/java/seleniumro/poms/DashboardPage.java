package seleniumro.poms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import seleniumro.controls.WebLink;
import seleniumro.controls.WebTextBlock;
import seleniumro.core.AbstractPOM;

public class DashboardPage extends AbstractPOM {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='wrap']/h1")
    public WebTextBlock pageTitle;

    @FindBy(xpath = "//div[@class='welcome-panel-content']/h2")
    public WebTextBlock welcomeMsg;

//	By homePageName = By.xpath("//div[@id='welcome-panel']/div/h2");
//	
//	@FindBy(xpath = "//a[not(contains(@class,'hide-if-customize')) and text()='Customise Your Site']")
//	public WebElement customizeBtn;
//	
//	@FindBy(xpath = "//div[@class='wrap']/h1")
//	public WebElement pageName;
//	
//	public DashboardPage(WebDriver driver){
//		this.driver = driver;
//		PageFactory.initElements(driver, this);
//	}
//	
//	//Get the Page name from Home Page
//	public String getHomePageDashboardName(){
//		 return	driver.findElement(homePageName).getText();
//	}
//	
//	public void clickCustomize(){
//		customizeBtn.click();
//	}

}
