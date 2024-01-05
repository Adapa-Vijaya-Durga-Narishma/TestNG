package UdemySectio16;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex1_Parametirization_FromXML {
	
	@Parameters({"URL1"})
	@Test
	public void signIn(String urlname)
	{
		System.out.println(urlname);
	}
	
	@Parameters({"URL2","URL2"})
	@Test
	public void signIn(String url1,String url2)
	{
		System.out.println(url1+" && "+url2);
	}
	
	
	
	// inherited data providers from Ex2_Parameterization_ByDataProviders
//	@Test(dataProvider="getData", dataProviderClass=Ex2_Parametirization_ByDataProviders.class)
//	public void signIn(String username,String password)
//	{
//		
//		System.out.println(username);
//		System.out.println(password);
//	}
}
