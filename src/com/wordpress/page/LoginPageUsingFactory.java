package com.wordpress.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageUsingFactory 
{
	WebDriver driver;
	
	public LoginPageUsingFactory(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(id="user_login") 
	@CacheLookup
	WebElement username;
	
	//@FindBy(id="user_pass") WebElement password;
	
	@FindBy(how=How.ID,using="user_pass") 
	@CacheLookup
	WebElement password;
	
	@FindBy(how=How.XPATH,using=".//*[@id='wp-submit']")
	WebElement submit_button;
	
	public void login_wordpresss(String uid, String pass)
	{
		username.sendKeys(uid);
		password.sendKeys(pass);
		submit_button.click();
		
	}
	
	
}
