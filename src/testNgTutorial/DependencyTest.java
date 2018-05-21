package testNgTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
	
	@Test
	public void startup()
	{
		System.out.println("Login to App");
	}
	
	@Test(dependsOnMethods="startup")
	public void login()
	{
		Assert.assertEquals(12, 13);
		System.out.println("Login to App");
		
	}
	
	@Test(dependsOnMethods="login")
	public void loginOut()
	{
		System.out.println("logOut to App");
	}



}
