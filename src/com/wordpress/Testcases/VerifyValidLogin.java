package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.page.LoginPageUsingFactory;

import helper.BrowserFactory;

public class VerifyValidLogin
{
	static WebDriver driver;
	BrowserFactory obj = new BrowserFactory();
	@Test
	public void checkValidLogin()
	{
		//This will launch browser with specific url
		WebDriver driver=BrowserFactory.browserName("firefox", "http://demosite.center/wordpress/wp-login.php");
		
		//Created Page object using page factory
		LoginPageUsingFactory loigin_page1 = PageFactory.initElements(driver, LoginPageUsingFactory.class);
		
		//call the method
		loigin_page1.login_wordpresss("admin", "demo123");
		
	}
}

//