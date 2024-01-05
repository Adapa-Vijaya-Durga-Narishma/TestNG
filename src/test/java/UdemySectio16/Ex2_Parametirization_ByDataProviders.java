package UdemySectio16;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Ex2_Parametirization_ByDataProviders {
	
	@Test(dataProvider="getData")
	public void signIn(String username,String password)
	{
		
		System.out.println(username);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[3][2];
		
		data[0][0]="1st Username";
		data[0][1]="1st Password";
		
		data[1][0]="2ND Username";
		data[1][1]="2ND Password";
		
		data[2][0]="3RD Username";
		data[2][1]="3RD Password";
		
		return data;
	}
	
	
}
