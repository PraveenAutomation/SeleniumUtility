package com.wordpress.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.page.LoginPage;
import com.wordpress.page.LoginPageWithParameter;

public class LoginTest {
	
	@Test
	public void verifyLoginTest()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		LoginPageWithParameter loginPage=new LoginPageWithParameter(driver);
		
		loginPage.typeUserName("admin");
		loginPage.typePassword("demo123");
		loginPage.clickLoginbtn();
		
		driver.quit();
	}

}
