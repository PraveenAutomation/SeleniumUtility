package testNgTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;


public class FirstTestNGScript {
	
	@Test(priority=1, description="This is test of Login functionality")
	public void LoginTest()
	{
		System.out.println("Login page Test");
		Assert.assertEquals(12, 13);
		
	}
	
	@Test(priority=2,description="Landing Functionality")
	public void HomePage()
	{
		System.out.println("Land Home Page");
		
	}
	
	@Test(priority=3,description="Check out functionality")
	public void CheckOut()
	{
		System.out.println("Check out test");
		
	}

}
