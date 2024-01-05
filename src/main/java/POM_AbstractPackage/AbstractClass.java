package POM_AbstractPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractClass {
	WebDriver driver;
	
	public AbstractClass(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void waitForElementToAppear(By findBy)
	{
		WebDriverWait wait=new WebDriverWait(driver,5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public void waitForElementToDisapear(By findBy)
	{
		WebDriverWait wait=new WebDriverWait(driver,5000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(findBy));
	}
	
	@FindBy(css="button[routerlink='/dashboard/cart']")
	WebElement cart;
	public void goToCart() throws InterruptedException
	{
		Thread.sleep(5000);
		cart.click();
	}
}
