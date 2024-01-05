package Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterClass {
	
	WebDriver driver;
	@Test(priority=1)
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		Reporter.log("Browser Launched");
		driver.manage().window().maximize();
		Reporter.log("Browser Maximized");
	}
	
	@Test(priority=2)
	public void getUrl()
	{
		driver.get("https://www.google.com/");
		Reporter.log("Google Browser Opened");
	}
	
	@Test(priority=3)
	public void getTitle()
	{
		String title=driver.getTitle();
		System.out.println("Title is : " +title);
		Reporter.log("Printing the title");
	}
	
	@Test(priority=4)
	public void closeBrowser()
	{
		driver.close();
		Reporter.log("Closing the Browser");
	}
}
