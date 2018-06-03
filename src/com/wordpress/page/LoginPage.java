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
public class LoginPage {
	
	WebDriver driver;
	
	By username=By.id("user_login");
	By password=By.xpath("//input[@id='user_pass']");
	By loginbtn=By.name("wp-submit");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	/*public void typeUserName()
	{
		driver.findElement(username).sendKeys("admin");
	}
	
	public void typePassword()
	{
		driver.findElement(password).sendKeys("demo123");
	}
	
	public void clickLoginbtn()
	{
		driver.findElement(loginbtn).click();
	}*/

}
