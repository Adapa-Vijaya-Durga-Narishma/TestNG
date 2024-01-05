package UdemySectio16;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Reports {
	@AfterTest
    public void lastexecution()
    {
        System.out.println("I will execute last");
        
        
    }
    @Test
    public void Demo()
    {
        System.out.println("hello");
        
    }
    @AfterSuite  
    public void suite()
    {
        System.out.println("I am the no 1 from last ");
        Assert.assertTrue(false);
    }
    @Test
    public void SecondTest()
    {
        System.out.println("bye");
    }
}
