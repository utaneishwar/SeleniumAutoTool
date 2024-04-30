package testngdiscussion;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.AssMethodForScreenshot;
import utility.Screenshot;

public class Testng1 extends MMTTestclass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{

	}


	@Override
	public void onTestSuccess(ITestResult result) 
	{


	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test case "+result.getName()+" has failed");

		try {
			AssMethodForScreenshot.Screenshot(driver, result.getName());
		} 
		catch (IOException e) 
		{

			System.out.println("Exception arrive while capturing the Screenshot");
		}         
	}




	@Override
	public void onTestSkipped(ITestResult result) 
	{

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

	}

	@Override
	public void onFinish(ITestContext context) 
	{
	}




}
