import org.testng.annotations.Test;

public class FacebookLogin {

	@Test
	public void loginValidCredentials() {
		
		System.out.println("Facebook Successfull login");

	}
	
	@Test
	public void logininvalidcredential()
	{
		System.out.println("Facebook NOT Successfull login");
		
	}

	@Test
	public void logininvalidcredentialtwo()
	{
		System.out.println("Facebook NOT Successfull login test 2");
		
	}
	
}
