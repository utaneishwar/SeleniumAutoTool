package testngdiscussion;

import org.testng.annotations.Test;

public class EnabledKeyword 
{
	// ENABLEDKEYWORD: This keyword is used to comment (skipped) the test case if we want 
	                  // and this used with priority and without prioritybase in paramneter 
	
	
	@Test 
	public void Login()
	{
		System.out.println("login test case ");
	}
	
	@Test  (enabled= false)           // it will be consider 0 priority if will not mention 
	public void home()                  // this test case commented (skipped)by using enabled keyword
	{
		System.out.println("home test case ");
	}
	
	@Test (priority=-3)
	public void profile ()
	{
		System.out.println("profile test case ");
	}
	
	@Test 
	public void Logout()
	{
		System.out.println("logout test case ");
	}
	
	
	//output  :   profile test case 
//	               login test case 
//              	logout test case 
//	               PASSED: Login
//	               PASSED: profile
//	               PASSED: Logout


}
