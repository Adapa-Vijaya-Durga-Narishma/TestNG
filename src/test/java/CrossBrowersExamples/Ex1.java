package CrossBrowersExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Ex1 {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void beforeTest(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();	  
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
	}
	
	@Test
	public void test()
	{
		driver.get("https://www.toolsqa.com/testng/cross-browser-testing-using-testng/");
	}
	
	@AfterTest
	public void afterTest()
	{

		System.out.println("closed");
	}
}
