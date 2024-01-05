package firstPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Ex1_Priority {

		@Test
		 public void testCase1() {
		   System.out.println("This is the A Normal Test Case"); 
		 }

		 @BeforeMethod
		 public void beforeMethod() { 
		   System.out.println("This will execute before every Method");
		 }
		 
		 @AfterMethod
		 public void afterMethod() {
		   System.out.println("This will execute after every Method");
		 }
		 
		 @BeforeClass
		 public void beforeClass() {
		   System.out.println("This will execute before the Class");
		 }
		 
		 @AfterClass
		 public void afterClass() {
		   System.out.println("This will execute after the Class");
		 }
		 
		 @BeforeTest
		 public void beforeTest() {
		   System.out.println("This will execute before the Test");
		 }
		 
		 @AfterTest
		 public void afterTest() {
		   System.out.println("This will execute after the Test");
		 }
		 
		 @BeforeSuite
		 public void beforeSuite() {
		   System.out.println("This will execute before the Test Suite");
		 }
		 
		 @AfterSuite
		 public void afterSuite() {
		   System.out.println("This will execute after the Test Suite");
		 }
		@Test (priority = 1)
		public void b_method() {
			System.out.println("This is B method");
		}
			
		@Test (priority = 1)
		public void a_method() {
			System.out.println("This is A method");
		}
			
		@Test
		public void d_method() {
			System.out.println("This is D Method");
		}
			
		@Test
		public void c_method() {
			System.out.println("This is C Method");
		}
//	   WebDriver driver = new ChromeDriver();
//	 @Test (priority=4)
//	    public void CloseBrowser () {
//	        //driver.close();
//	        System.out.println("closing the google chrome browser");
//	    }
//	    @Test (priority=0)
//	    public void OpenBrowser() {
//	        System.out.println("Launching google chrome website");
//	       driver.get("https://www.google.com");
//	    }
//	    
//	    @Test (priority=2)
//	    public void AccountTest() {
//	        System.out.println("Some tests for customer Account");
//	    }

	}

