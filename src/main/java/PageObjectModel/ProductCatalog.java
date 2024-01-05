package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import POM_AbstractPackage.AbstractClass;

public class ProductCatalog extends AbstractClass{
	
WebDriver driver;
	
	public ProductCatalog(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="mb-3")
	List<WebElement> products;
	
	By productBy = By.className("mb-3");
	public List<WebElement> getProductList()
	{
		waitForElementToAppear(productBy);
		return products;
	}
	
	By toastMessage=By.id("toast-container");
	By animation=By.cssSelector(".ng-animating");
	public void addToCart(String expectedProductname)
	{
		waitForElementToAppear(toastMessage);
		waitForElementToDisapear(animation);
		
		for(int i=0;i<products.size();i++)
		{
			if(getProductList().get(i).findElement(By.cssSelector(".card-body b")).getText().equalsIgnoreCase(expectedProductname))
			{
				driver.findElement(By.cssSelector(".mb-3 button:last-child")).click();
			}
		}
	}
	
	By subtotalList = By.cssSelector(".subtotal li:last-child button");
	
	public void checkOut() throws InterruptedException
	{
		waitForElementToAppear(subtotalList);
		driver.findElement(By.cssSelector(".subtotal li:last-child button")).click();   //checkout
	}
	
	
	@FindBy(css="form-group .text-validated:last-child")
	WebElement countrynamefield;
	By selectCountryField = By.cssSelector(".form-group .text-validated:last-child");
	By listOfCountries = By.cssSelector(".ta-results");
	public void selectCountry(String countryName) throws InterruptedException
	{
		waitForElementToAppear(selectCountryField);
		
		driver.findElement(By.cssSelector(".form-group .text-validated:last-child")).sendKeys("india");
		waitForElementToAppear(listOfCountries);
		List<WebElement> countries=driver.findElements(By.cssSelector(".ta-item"));
		for(int i=0;i<countries.size();i++)
		{
			if(countries.get(i).getText().equals("India"))
			{
				countries.get(i).click();
			}
		}
	}
	
	@FindBy(css="a.ng-star-inserted")
	WebElement placeOrderButton;
	
	By thankyouTextCheck = By.cssSelector(".hero-primary");
	
	@FindBy(css=".hero-primary")
	WebElement thankyouText;
	String expectedHeading="THANKYOU FOR THE ORDER.";
	public void placeOrder()
	{
		placeOrderButton.click();    // placeorder
		waitForElementToAppear(thankyouTextCheck);
		
		String actualHeading = thankyouText.getText();
		Assert.assertEquals(actualHeading, expectedHeading);
		System.out.println("PlacedOrder");
	}
}
