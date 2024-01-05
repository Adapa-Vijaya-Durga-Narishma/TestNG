package Reports;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class EmailReport {
	@Test
	public void passTest()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void failTest()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void skipTest()
	{
		throw new SkipException("Skip test method");
	}
}
