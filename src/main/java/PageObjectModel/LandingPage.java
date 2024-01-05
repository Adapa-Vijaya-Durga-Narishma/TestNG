package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import POM_AbstractPackage.AbstractClass;

public class LandingPage extends AbstractClass {
	WebDriver driver;
	
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	public LandingPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userEmail")
	WebElement UserEmail;
	
	@FindBy(id="userPassword")
	WebElement Password;
	
	@FindBy(id="login")
	WebElement Login;
	public void LoginPage(String email, String password)
	{
		UserEmail.sendKeys(email);
		Password.sendKeys(password);
		Login.click();
	}
	
	
	
}
