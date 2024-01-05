package Priorities;

import org.testng.annotations.Test;

public class PrioritizedTests {
	@Test
	public void login()
	{
		System.out.println("LogIn successful");
	}
	@Test(priority=-1)
	public void openBrowser()
	{
		System.out.println("Open Browser successful");
	}
	@Test(enabled=false)
	public void viewAccount()
	{
		System.out.println("View Account successful");
	}
}
