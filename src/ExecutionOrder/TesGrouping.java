package ExecutionOrder;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TesGrouping {
	

	@Test (groups ="Regression")
	public void regression() {
		
		System.out.println("Regression Test  ");	  
		

	}
	@Test (groups ="Regression")
	public void RegressionTwo()
	{
		System.out.println("|Regression Two test");
		
		
	}
	@Test (groups ="Smoke")
	public void smokeTest()
	{
		
		System.out.println("Smoke Test test case");

		
	}

	@Test (groups ={"Smoke", "Regression"})
	public void Aftermethod()
	{
		
		System.out.println("Smoke & Regression test case");

		
	}

	
}
