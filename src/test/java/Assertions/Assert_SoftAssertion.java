package Assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_SoftAssertion {
	WebDriver driver = new ChromeDriver();
	
	@Test (priority = 0)
	public void CloseBrowser() {
		System.out.println("Closed");
		driver.close();
		
		
	}
	
	@Test (priority = -1)
	public void OpenBrowser() {
			
	        
	        driver.get("https://www.demoqa.com");
	        SoftAssert softassert = new SoftAssert();
	        System.out.println("***");
	        String expectedTitle = "Free QA Automation Tools For Everyone";
	        String originalTitle = driver.getTitle();
	        softassert.assertEquals(originalTitle, expectedTitle);
	        System.out.println("*** Checking For The Second Title ***");

	        softassert.assertEquals(originalTitle, "ToolsQA – Demo Website to Practice Automation – Demo Website to Practice Automation" );
	        softassert.assertAll();
}}
