package testngdiscussion;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.AssMethodForScreenshot;

public class SearchFlightTestNg2 extends SearchFlightTestng implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		 System.out.println("test case "+result.getName()+" has failed ");
	       // screenshotcode
		 try
		 {
			AssMethodForScreenshot.Screenshot(driver, result.getName());
		}
      catch (IOException e) 
		 {
			System.out.println("Excute exception while capturing Screenshot");
			
	     }
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
