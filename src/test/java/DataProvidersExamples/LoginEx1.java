package DataProvidersExamples;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginEx1 {
	WebDriver driver;
	@DataProvider(name="Authentication")
	public Object[][] credentials()
	{
		return new Object[][] {{"Vijaya","Vijaya@123"},{"Durga","Durga@123"}};
	}
	 
	@Test(dataProvider="Authentication")
	public void test(String username, String password)
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/login");
		WebElement usernameField=driver.findElement(By.id("userName"));      //username
		usernameField.click();
		usernameField.sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);            //password
		driver.findElement(By.id("login")).click();                          //login
		driver.findElement(By.cssSelector(".col-sm-12 button")).click();     //logout
	}
	
	
}
