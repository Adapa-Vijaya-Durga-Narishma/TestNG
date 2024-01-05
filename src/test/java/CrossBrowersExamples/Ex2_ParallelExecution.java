package CrossBrowersExamples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ex2_ParallelExecution {
	WebDriver driver;

	@Test
	public void firefox() throws InterruptedException
	{
		driver=new FirefoxDriver();
		driver.get("https://toolsqa.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Enroll')]")).click();
		System.out.println("firefox clicked");
	}
	
	@Test
	public void chrome() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://toolsqa.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Enroll')]")).click();
		System.out.println("Chrome clicked");
	}
}
