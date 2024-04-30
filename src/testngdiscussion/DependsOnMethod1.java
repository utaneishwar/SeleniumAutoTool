package testngdiscussion;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class DependsOnMethod1 
{

	@Test (priority=1)
   public void LoginToApp()
  {
	System.out.println(" log in to appllication test case");
	// throw new NoSuchElementException();
  }
	 
  
	@Test (priority = 1000, dependsOnMethods = {"LoginToApp"})
      public void Homepage()
      {
	   System.out.println("home page test case");
	   throw new ArithmeticException();
     }
	
  
	@Test (priority = 1001 ,dependsOnMethods = {"Homepage","LoginToApp"} )   // it depends on two test cases 
       public void Logout()                                     // if any of one test case  not executed between them then this test case also not execute means pass
      {
	   
	   System.out.println(" logout test case");
      }
	
	
}
