package screenShot.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E://BULUT DRIVE//New Software//Browsers & their drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		screeShot("facebook_LoginPage");
		System.out.println(driver.getTitle());
		

	}
	public static void screeShot(String fileName) throws IOException
	{
		// 1. take screenshot and store it as file format
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//2. Now copy the screenshot to desired location using copyfile method
		FileUtils.copyFile(file, new File("C://Users//Dell//12_Feb_Automation//SeleniumPractice//screenshots//"+fileName+".jpg"));
	}

}
