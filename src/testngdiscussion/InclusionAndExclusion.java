package testngdiscussion;

import org.testng.annotations.Test;

public class InclusionAndExclusion 
{
   //  Concept of Inclusion And Exclusion 
  //  we can inclusion and exclusion of methods inside the xml using keyword "methods" and include with the name of  method to include
  //  Exclusion: it is used to Skipped the method if we want ...
	
	
	@Test  (priority=1)
	public void getDetails()
	{
		System.out.println(" Get details test case ");
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
//	[RemoteTestNG] detected TestNG version 7.4.0
//	 Get details test case 
//	 Logout test case 

	
}
