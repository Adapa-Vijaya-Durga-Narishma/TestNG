package CrossBrowersExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ex3_ThreadCount {
	WebDriver driver;

	@Test
	public void firefox() throws InterruptedException
	{
		System.out.println("The thread ID for Firefox is "+ Thread.currentThread().getId());
		driver=new FirefoxDriver();
		driver.get("https://toolsqa.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Enroll')]")).click();
		
	}
	
	@Test
	public void chrome() throws InterruptedException
	{
		System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
		driver=new ChromeDriver();
		driver.get("https://toolsqa.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(text(),'Enroll')]")).click();
		
	}
}
