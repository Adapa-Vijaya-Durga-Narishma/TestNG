package UdemySectio16;

import org.junit.Assert;
import org.testng.annotations.Test;

public class HelperAttribute_TimeOut {
	@Test(timeOut=2000)
	public void signIn()
	{
		System.out.println("Opening URL");
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
