package testngdiscussion;

import org.testng.annotations.Test;

public class TestNgAllkeyword2
{


	@Test (priority=3, dependsOnMethods = "testngdiscussion.TestngAllKeyword.LaunchBrowser")
	public void Logout()
	{
		System.out.println("logout test case");
	}

}
