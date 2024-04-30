package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingForTestCasesPractice
{
	@Test(priority=1,groups="functional")
	public void m1()
	{
		System.out.println(" m1 method from functionl group");
	}
	@Test(priority=2,groups="functional")
	public void m2()
	{
		System.out.println(" m2 method from Functional group");	
	}
	
	//--------------------------------------
	@Test(priority=3, groups="Sanity")
	public void m3()
	{
		System.out.println(" m3 method from Sanity group");
	}
	@Test(priority=4, groups="Sanity")
	public void m4()
	{
		System.out.println(" m4 method from Sanity group");
	}
	//------------------------------------
	@Test(priority=5, groups={"regressional","functional","Sanity"})
	public void m5()
	{
		System.out.println(" m5 method from regressional groups");
	}
 

}
