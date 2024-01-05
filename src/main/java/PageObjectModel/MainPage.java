package PageObjectModel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		String productName="ZARA COAT 3";
		String countryName="india";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		LandingPage landingPage=new LandingPage(driver);
		landingPage.goTo();
		landingPage.LoginPage("narishmaadapa@gmail.com", "Narishma@123");
		
		ProductCatalog productCatalog = new ProductCatalog(driver);
		List<WebElement> products = productCatalog.getProductList();
		productCatalog.addToCart(productName);
		productCatalog.goToCart();
		productCatalog.checkOut();
		productCatalog.selectCountry(countryName);
		productCatalog.placeOrder();
	}

}
