/**
 * 
 */
package com.wordpress.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Dell
 *
 * This class will store all the methods and locators of Login Page.
 */
public class LoginPageWithParameter {
	
	WebDriver driver;
	
	By username=By.id("user_login");
	By password=By.xpath("//input[@id='user_pass']");
	By loginbtn=By.name("wp-submit");
	
	public LoginPageWithParameter(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeUserName(String uid)
	{
		driver.findElement(username).sendKeys(uid);
	}
	
	public void typePassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLoginbtn()
	{
		driver.findElement(loginbtn).click();
	}

}
