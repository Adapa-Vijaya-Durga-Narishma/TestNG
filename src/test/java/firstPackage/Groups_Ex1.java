package firstPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Groups_Ex1 {
String title="ToolsQA - Demo Website For Automation";
WebDriver driver =new ChromeDriver();
	
	@Test(groups= {"demo1"})
	public void AtartingPoint() throws InterruptedException
	{
		System.out.println("This is the starting point of the test");
		
		driver.get("https://demoqa.com/");
		Thread.sleep(5000);
		
	}
	
	@Test(groups= {"demo2"})
	public void checkTitle()
	{
		System.out.println("checktitle");
		String testTitle="DEMOQA";
		String originalTitle=driver.getTitle();
		Assert.assertEquals(originalTitle, testTitle);
	}
	
	@Test(groups= {"demo3"})
	public void clickElement()
	{
		System.out.println("clickR=Element");
		driver.findElement(By.xpath("//div[@class='home-body']//div[2]//div[1]//div[2]//*[name()='svg']")).click();
		System.out.println("clicked");
	}
}
