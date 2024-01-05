package UdemySectio16;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.org.apache.bcel.internal.classfile.Method;

public class Ex3_DataProviderWithMethodAsParameter {
	
	@DataProvider
	@Test
	public Object[][] getInput(Method m)
	{
		switch(m.getName())
		{
		case "Sum": 
			return new Object[][] {{2, 3 , 5}, {5, 7, 9}};
		case "Diff": 
			return new Object[][] {{2, 3, -1}, {5, 7, -2}};
		}
		return null;
	}
	@Test(dataProvider="getInput")
	public void Sum(int a, int b, int result)
	{
		int sum=a+b;
		Assert.assertEquals(sum, result);
		System.out.println(sum);
	}
	
	@Test(dataProvider="getInput")
	public void Diff(int a, int b, int result)
	{
		int diff=a-b;
		Assert.assertEquals(diff, result);
		System.out.println(diff);
	}
}
