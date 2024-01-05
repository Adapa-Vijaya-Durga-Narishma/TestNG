package UdemySectio16;

import org.junit.Assert;
import org.testng.annotations.Test;

public class HelperAttribute_EnabledFalse {
	@Test(enabled=false)
	public void signIn()
	{
		System.out.println("SignIn");
		Assert.assertTrue(false);
	}
	
	@Test
	public void openBrowser()
	{
		System.out.println("Open Browser");
	}
	
	@Test
	
	public void logOut()
	{
		System.out.println("LogOut");
	}
}
