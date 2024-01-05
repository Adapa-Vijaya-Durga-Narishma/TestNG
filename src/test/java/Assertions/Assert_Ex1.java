package Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Assert_Ex1 {
	
	WebDriver driver = new ChromeDriver();

	@Test (priority = 0)
	public void CloseBrowser() {
		
		System.out.println("Closed");
	}
	
	@Test (priority = -1)
	public void OpenBrowser() {
		
		driver.get("https://www.demoqa.com");
        String expectedTitle = "Free QA Automation Tools For Everyone";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, expectedTitle);
	}
	       
	        
	       

}
