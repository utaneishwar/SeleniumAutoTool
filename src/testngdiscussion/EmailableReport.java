package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.internal.ReporterConfig;
import org.testng.reporters.jq.ReporterPanel;

public class EmailableReport 
{
	// print message inside the report by using REPORTER class i,e- emailable report HTML
	
			@Test
			public void Login()
			{
				System.out.println("login test case");
				Reporter.log(" login test case report", true);
			
			}
			
			
			@Test
			public void Home()
			{
				System.out.println("home test case");
				Reporter.log("home  test case report", true);
			}
			
			
			
			@Test  (priority=-3,invocationCount = 5)
			public void Logout()
			{
				System.out.println("logout test case");
				Reporter.log("logout test case report", false);
			}
			
			
//	output:
//			logout test case
//			home test case
//			home  test case report
//			login test case        
//			login test case report
//			PASSED: Logout
//			PASSED: Home
//			PASSED: Login
//
//
}
