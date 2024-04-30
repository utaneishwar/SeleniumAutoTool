package testngdiscussion;

import org.testng.annotations.Test;

public class DOMClass2 
{  
 
	//  below test case depends on another test case status (homepage)
	// which is in DOMClass1 
	
	
	@Test(dependsOnMethods={"testngdiscussion.DOMClass1.homepage"})
    public void logout()
	{
		System.out.println("logout  test case ");
	}
	
	
}
