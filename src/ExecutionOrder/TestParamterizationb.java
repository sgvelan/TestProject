package ExecutionOrder;

import org.testng.annotations.*;
import org.testng.annotations.Parameters;

import com.beust.jcommander.*;


public class TestParamterizationb {	
		
	
	@Parameters("browser")
	@Test
	public void TestOneff(String browser){
			System.out.println("Test one browser as " + browser);
		
	}	
	
	@Parameters({"uname","password"})
	@Test	
	public void TestTwoff(String uname, String password)	{		
		System.out.println("Test one uname as " + uname);
		System.out.println("Test one password as " + password);		
	}

}