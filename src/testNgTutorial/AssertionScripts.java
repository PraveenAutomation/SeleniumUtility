package testNgTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScripts {
	
	@Test
	public void test11()
	{
		Assert.assertEquals(12, 13);
	}
	
	@Test
	public void test12()
	{
		System.out.println("Test 2 is started");
		Assert.assertEquals(12, 13, "Not mactched please connnect to dev");
		System.out.println("Test 2 is completed");
	}
	
	@Test
	public void test13()
	{
		System.out.println("Test 3 is started");
		Assert.assertEquals("Hello", "Hello", "Hello matched or not");
		System.out.println("Test 3 is completed");
	}


}
