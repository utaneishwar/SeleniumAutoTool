package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCases
{
	// How  to grouping of test cases 

	@Test(priority = 1,  groups="functional")
	public void getDetails()
	{
		System.out.println("Get details test case");
	}
	//---------------------------------	
	@Test(priority = 2, groups="regression")
	public void setDetails()
	{
		System.out.println("Set details test case");
	}
	//--------------------------------------------------------------
	@Test(priority = 3, groups = {"sanity", "functional"})
	public void login()
	{
		System.out.println("login test case");
	}

	//-----------------------------------------------------------
	@Test (priority = 4,  groups = "sanity")
	public void home()
	{
		System.out.println("home test case");
	}

	//-------------------------------------------------------------
	@Test(priority = 5, groups = {"functional", "regression"})
	public void profile()
	{
		System.out.println("profile test case");
	}

	//----------------------------------------------------------------	
	@Test(priority = 6,  groups = "functional")
	public void logout()
	{
		System.out.println("Logout test case");
	}
	// Note WE have to mention <Groups> (keyword) <run>(Tag) include or exclude inside xml file to perform grouping test cases
	// include- in that involve those groups which we have to mention in name "inside" include xml file 
	//Exclude _ In that doesn't involve those groups which we have to mention inside in "Include" inside xml file .
}





