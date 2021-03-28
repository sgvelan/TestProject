import org.testng.annotations.*;


public class SampleTest {
	
	@BeforeSuite
	public void beforesuitemethod ()
	{
		
		System.out.println("execute before test suite");
	}
	
	@AfterSuite
	public void aftersuitemethod ()
	{
		System.out.println("execute after test suite");
		
	}


}
