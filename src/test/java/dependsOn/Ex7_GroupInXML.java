package dependsOn;

import org.testng.annotations.Test;

public class Ex7_GroupInXML {
	@Test(groups= {"SIGNIN"})
	public void signIn()
	{
		System.out.println("SignIn");
	}
	
	@Test(groups= {"OPENBROWSER"})
	public void openBrowser()
	{
		System.out.println("Open Browser");
	}
	
	@Test(groups= {"LOGOUT"})
	
	public void logOut()
	{
		System.out.println("LogOut");
	}
}
