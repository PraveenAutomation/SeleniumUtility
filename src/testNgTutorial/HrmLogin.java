package testNgTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HrmLogin {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void startUp()
	{
		//System.setProperty("webdriver.chrome.driver", "E://BULUT DRIVE//New Software//Browsers & their drivers//chromedriver.exe");
		driver = new FirefoxDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String CurUrl = driver.getCurrentUrl();
		//CurUrl.contains("auth/login");
		Assert.assertTrue(CurUrl.contains("auth/login"));
	}
	
	@Test(priority=2)
	public void loginApp()
	{
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		boolean status=driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).isDisplayed();
		Assert.assertTrue(status);
	}
	
	@Test(priority=3)
	public void logOut()
	{
		driver.findElement(By.xpath(".//*[@id='welcome']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='txtUsername")).isDisplayed());
	}
	
	@Test(priority=4)
	public void closeUp()
	{
		driver.quit();
	}

}
