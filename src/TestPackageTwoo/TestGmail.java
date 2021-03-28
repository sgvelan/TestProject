package TestPackageTwoo;

import org.testng.annotations.Test;

public class TestGmail {
	
	@Test
	public void GmailloginValidCredentials() {
		
		System.out.println("Gmail Successfull login");

	}
	
	@Test
	public void Gmaillogininvalidcredential()
	{
		System.out.println("Gmail NOT Successfull login");
		
	}

}
