package dependsOn;

import org.testng.annotations.Test;

public class Ex5_InheritedDependentTests extends main{
	
	@Test(dependsOnMethods= {"openBrowser"})
	public void logOut()
	{
		System.out.println("LogOut");
	}
}

class main 
{
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
	
}
