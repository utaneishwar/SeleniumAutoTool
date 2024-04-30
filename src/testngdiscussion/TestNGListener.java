package testngdiscussion;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("test case "+result.getName()+" Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("test case "+result.getName()+" Has passed");
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("test case "+result.getName()+" has failed");	
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("test case "+result.getName()+" has Skipped");	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("test tag "+context.getName()+" has started ");		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("test tag "+context.getName()+" has completed ");
	}

}
