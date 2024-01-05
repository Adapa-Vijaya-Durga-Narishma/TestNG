package dependsOn;

import org.testng.annotations.Test;

public class Ex3_SingleDependentMethod {
	
	@Test(dependsOnMethods= {"openBrowser"})
	public void signIn()
	{
		System.out.println("SignIn");
	}
	
	@Test
	public void openBrowser()
	{
		System.out.println("Open Browser");
	}
	
	@Test(dependsOnMethods= {"signIn"})
	public void logOut()
	{
		System.out.println("LogOut");
	}
}
