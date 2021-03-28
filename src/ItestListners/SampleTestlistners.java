package ItestListners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestlistners {
	@Test
	public void testone() {
		System.out.println("test one");
	}

	@Test (dataProvider ="dataprovider")
	public void testgetData(String s) {
		System.out.println("test Getdata method =" + s);
	}
	
	@DataProvider
	public Object[] dataprovider() {
		return new Object[] {"A","B"};
	}
	
	
	@Test
	public void testThree() {
		Assert.assertEquals(5, 7);		
	}

	@Test
	public void testFour() {
		System.out.println("Test four");
		throw new SkipException(null);
	}
	
}
