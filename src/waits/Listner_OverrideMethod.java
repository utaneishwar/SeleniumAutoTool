package waits;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner_OverrideMethod extends ExplicitWait_Mock implements ITestListener
{


	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"Test case passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+"Test case failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+"Test case Skipped");
	}


	
	

}
