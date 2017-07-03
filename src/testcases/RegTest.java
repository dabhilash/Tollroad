package testcases;

//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegTest 
{
	SoftAssert sa=new SoftAssert();
	@Test
	public void regtest()
	{
		String ExpectedTitle ="xxxx";
		String ActualTitle ="xxxxy";
		//Assert.assertEquals(ActualTitle, ExpectedTitle);
		//Assert.assertTrue(2>11, "Error Message");	
		//Assert.assertTrue(isElementPresent("XXXX"), "Element Not found");
		System.out.println("A");
		sa.assertEquals(ActualTitle, ExpectedTitle);
		System.out.println("B");
		sa.assertAll();
}
}