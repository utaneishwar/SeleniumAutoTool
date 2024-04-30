package testngdiscussion;

import org.testng.annotations.Test;

public class PriorotyAmol 
{

	  @Test(priority=-1)
	  public void m1() 
	  {
		 System.out.println("-1 Test case"); 
	  }
	  @Test
	  public void m3() 
	  {
		  System.out.println("zero test case");
	  } 
	  
	  
	  @Test(priority=1)
	  public void m2() 
	  {
		System.out.println("1 test case");  
	  }
	  
}
