package testNgTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionScripts2 {
	
	@Test
	public void test1()
	{
		String myStr="Praveen Mishra";
		Assert.assertTrue(myStr.contains("Ratan"),"Name contain or not");
	}
	
	@Test
	public void test2()
	{
		Assert.assertFalse(false);

	}
	



}
