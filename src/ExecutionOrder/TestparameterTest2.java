package ExecutionOrder;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestparameterTest2 {

	@Test(dataProvider ="DoubleSet")
	public void testaddition (int actual, int expected) {
		
		int actualValue =actual +20;
		Assert.assertEquals(actualValue, expected);
		
	}
	
	@DataProvider
	public Object[][] getdata(){
		return new Object [][] {
			{100, 120},
			{200, 220},
			{250, 220},
			{300, 320},
			{400, 420}
			
		};
	}
	
	
	@DataProvider (name = "DoubleSet")
	public Object[][] getdataset2(){
		return new Object [][] {
			{100, 200},
			{20, 20},
			{25, 220},
			{300, 320},
			{400, 420}
			
		};
	}
	}
	

