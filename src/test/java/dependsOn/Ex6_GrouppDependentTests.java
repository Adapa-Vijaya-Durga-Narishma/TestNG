package dependsOn;

import org.testng.annotations.Test;

public class Ex6_GrouppDependentTests {
	
	@Test(groups= {"group"})
	public void signIn()
	{
		System.out.println("SignIn");
	}
	
	@Test(groups= {"group"})
	public void openBrowser()
	{
		System.out.println("Open Browser");
	}
	
	@Test(dependsOnGroups= {"group"})
	
	public void logOut()
	{
		System.out.println("LogOut");
	}
}
