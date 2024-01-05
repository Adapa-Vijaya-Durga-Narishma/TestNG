package CrossBrowersExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ex4_ParallelTestSuites {
	public WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Thread Number Is " + Thread.currentThread().getId());
		driver = new ChromeDriver();
	}

    @Test
 	public void ChromeTestMethod()
 	{ 

	 System.out.println("The thread ID for Chrome Test is "+ Thread.currentThread().getId());
	 
	 driver.get("https://toolsqa.com/");
	 driver.findElement(By.xpath("//a[contains(text(),'Enroll')]")).click();
 
      }
 
     @AfterTest
     public void afterTest() {
	 System.out.println("After Test Thread Number Is " + Thread.currentThread().getId());
	 System.out.println("closed");
    }
}
