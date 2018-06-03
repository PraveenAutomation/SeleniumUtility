package testNgTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class VerifyTitle {
	
	WebDriver driver;
	
	@Test
	public void verifyTitle()
	{
		driver =new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://learn-automation.com/");
		
		boolean isTheTextPresent = driver.getPageSource().contains("Selenium WebDriver tutorial - Selenium WebDriver tutorial Step by Step");
		Assert.assertTrue(isTheTextPresent);
		
		//String actual_title=driver.getTitle();
		//System.out.println(actual_title);
		
		//String expected_title="Selenium WebDriver tutorial - Selenium WebDriver tutorial Step by Step";
		
		//Assert.assertEquals(actual_title, expected_title);
		//System.out.println("Verify Completed");
		driver.close();
	}
	

}
