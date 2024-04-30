package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterClass 
{
	@Test (priority=1)
	public void login()
	{
		
		System.out.println("log in test case ");
		Reporter.log("log in test case report", true); // print in both 
		Reporter.log("log in test case1 report",false);
	}
	@Test(priority=2)
	public void addproduct()
	{
		System.out.println("addproduct test case ");

	}
	@Test(priority=3)
	public void placeorder()
	{
		System.out.println("placeorder test case ");
	}
}

