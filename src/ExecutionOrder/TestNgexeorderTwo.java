package ExecutionOrder;

import org.testng.annotations.*;

public class TestNgexeorderTwo {
	
	
	@Test
	public void Firsttest() {
		
		System.out.println("First Test Test annotations ");

	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before method annotations");
		
	}
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("After method annotations");
		
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Before Class annotations");
		
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class annotations");
		
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("After Test annotations");
		
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("After Suite annotations");
		
	}

}
