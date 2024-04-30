package testngdiscussion;

import org.testng.annotations.Test;

public class TestClass 
{ 
	// LISTENERS IN TESTNG: In TESTNG we have an interface ITestListner
	                       // which is used to listen or track the Status of the Each test cases and 
	                        // based on wich we execute the Specified methods from implemented class of that interface
	
	@Test  (priority=1)
	public void getDetails()
	{
		//throw new ArithmeticException();
	//	System.out.println(" Get details test case ");
		
	}
	
	@Test  (priority=2)
	public void SetDetails()
	{
		System.out.println(" set details test case ");
	}
	@Test  (priority=3)
	public void login()
	{
		System.out.println(" Login test case ");
	}
	@Test  (priority=4)
	public void Home()
	{
		System.out.println(" Home test case ");
	}
	@Test  (priority=5)
	public void profile()
	{
		System.out.println(" Profile test case ");
	}
	
	@Test  (priority=6)
	public void Logout()
	{
		System.out.println(" Logout test case ");
	}

}
