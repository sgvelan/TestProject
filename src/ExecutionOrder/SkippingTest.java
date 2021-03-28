package ExecutionOrder;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class SkippingTest {
	
	
	@Test (priority =4)
	public void Firsttest() {
		
		System.out.println("First Test  ");	  
		Assert.assertEquals("Test", "Test");

	}
	@Test (priority =2)
	public void BeforeMethod()
	{
		System.out.println("second test");
		Assert.assertTrue(false);
		
	}
	@Test (priority =3)
	public void Aftermethod()
	{
		Assert.assertEquals(200, 200);
		System.out.println("third test case");

		
	}
	
	@Test (priority =1)
	public void BeforeClass()
	{
		SoftAssert softassert =new SoftAssert ();
		System.out.println("fourth test case - soft assert");
		softassert.assertEquals(2, 10);
		System.out.println("fourth test case - softassert two");
		softassert.assertAll();
		
	
}
}
