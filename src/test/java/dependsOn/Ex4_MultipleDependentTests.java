package dependsOn;

import org.testng.annotations.Test;

public class Ex4_MultipleDependentTests {
	
	@Test
	public void signIn()
	{
		System.out.println("SignIn");
	}
	
	@Test
	public void openBrowser()
	{
		System.out.println("Open Browser");
	}
	
	@Test(dependsOnMethods= {"signIn","openBrowser"})
	public void logOut()
	{
		System.out.println("LogOut");
	}
}
