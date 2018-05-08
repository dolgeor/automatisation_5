package seleniumro.tests.login_sing_out;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumro.core.BaseTest;
import seleniumro.core.WordPress;

@Test
public class SingOutTest extends BaseTest {

    public void test() {
        WordPress wp = WordPress.init(driver);

        wp.loginPage.login("admin", "admin_pass!");
        wp.dashboardPage.pageTitle.equals("Dashboard");
        wp.dashboardPage.welcomeMsg.equals("Welcome to WordPress!");

        WebElement element = driver.findElement(By.xpath("//li[@id='wp-admin-bar-logout']/a"));
        JavascriptExecutor Executor = (JavascriptExecutor) driver;
        Executor.executeScript("arguments[0].click();", element);
        Assert.assertEquals("http://testing.webtic.info/wordpress/wp-login.php?loggedout=true",
                driver.getCurrentUrl());
    }
}
