package ExecutionOrder;

import org.testng.annotations.*;

public class TestNgexeorderOne1 {
	
	
	@BeforeTest
	public void Beforetestt() {
		
		System.out.println("Before Test annotations ");

	}
	
	@BeforeSuite
	public void BeforeSuitee()
	{
		System.out.println("Before suite annotations");
		
	}

	
	
}
