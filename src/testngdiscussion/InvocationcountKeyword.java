package testngdiscussion;

import org.testng.annotations.Test;

public class InvocationcountKeyword 
{
	//Invocational Keyword :  This keyword is used to print testcases multiple time depends on count like 5-6-10 
	                        //write in parameter of the (@Test)annotationTest with or withoput priority 
	@Test 
	public void Login()
	{
		System.out.println("login test case");
	}
     @Test (priority=2,invocationCount = 5)   // this tes case print multiple time 
	public void Home()
	{
		System.out.println("home test case");
	}

	@Test
	public void Logout()
	{
		System.out.println("logout test case");
	}

	
	//o/p: will get 7 test cases pass
}
