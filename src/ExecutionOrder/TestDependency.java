package ExecutionOrder;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependency {
	
	@Test
	public void Firsttest() {
		
		System.out.println(" First Regression Test  ");	  		

	}
	@Test (dependsOnMethods ="Firsttest")
	public void Secondtest()
	{
		Assert.assertTrue(false);
		System.out.println("|Second Two test");
		
		
	}


	@Test (dependsOnMethods ="thirdTest")
	public void FourthTest()
	{
		
		System.out.println("Fourth test case");

		
	}

	@Test (dependsOnMethods ="Secondtest")	
	public void thirdTest()
	{
		
		System.out.println("Third  Test test case");

		
	}



}
