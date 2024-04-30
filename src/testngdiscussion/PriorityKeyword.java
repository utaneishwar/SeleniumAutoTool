package testngdiscussion;

import org.testng.annotations.Test;

public class PriorityKeyword 
{
	// @Test called as annotation 
	// priority is keyword coming from TestNg
	// And executed test cases based on priority
	// priority can have +ve,-ve.and 0 but it not be in decimal.or not in fraction 
	// we can give priority like-3000 and 
	// if any of the test case doesnt have any priority then it will count as zero priority
	//  priority can be duplicate and if we define test cases having same priority then those test cases will be executed in alphabetic order 
	
	
	
	
	@Test  (priority=1)
	public void login()
	{
		System.out.println("Login test case");
	}
	@Test  (priority=2) 
	public void home()
	{
		System.out.println("home test case");
	}
	
	@Test  (priority=3)
	public void profile()
	{
		System.out.println("profile test case");
	}
	@Test  (priority=4)
	public void logout()
	{
		System.out.println("Logout test case");
	}
	//output  :Login test case
//	           home test case
//	           profile test case
//	           Logout test case

}
