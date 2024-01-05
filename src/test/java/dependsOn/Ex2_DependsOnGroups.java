package dependsOn;

import org.testng.annotations.Test;

public class Ex2_DependsOnGroups {

	@Test(dependsOnGroups= {"SignIn"})
	public void ViewAcc()
	{
		System.out.println("View Account");
	}
	
	@Test(groups= {"SignIn"})
	public void signIn()
	{
		System.out.println("SignIn");
	}
}
