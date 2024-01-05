package dependsOn;

import org.testng.annotations.Test;

public class Ex1_DependsOnMethod {
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
}
