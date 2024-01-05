package UdemySectio16;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Listeners implements ITestListener{
	@Override
    public void onTestStart(ITestResult result) {
         
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("I successfully executed Listeners Pass code");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        //screenshot code 
        System.out.println("I failed executed Listeners Pass code" +result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
        
    }

    @Override
    public void onFinish(ITestContext context) {
        
    }
}
