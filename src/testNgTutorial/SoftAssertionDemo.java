package testNgTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class SoftAssertionDemo {
	
	@Test
	public void testSoft()
	{
		SoftAssert assertion = new SoftAssert();
		System.out.println("Started");
		assertion.assertEquals(12, 13,"matched or not");
		System.out.println("Completed");
		assertion.assertAll();
	}
	
	@Test
	public void hardAssert()
	{
		System.out.println("StartedHard");
		Assert.assertEquals(12, 13);
		System.out.println("Completed Hard");
	}
	

}
