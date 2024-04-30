package testngdiscussion;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class DependsOnMethod 
{
	//DependsOnMethos  : it is keyword which is used to depends method on another method i.e break for run (skiped)the any of the test case 
    // multiple test cases are depend on each other (scenario)so if any one of test case not execute
	// then another test cases will not executed due to " dependsOnMethod keyword "
	
	
	@Test (priority=1)
   public void LoginToApp()
  {
	System.out.println(" log in to appllication test case");
	throw new NoSuchElementException();
  }

  
	@Test (priority = 1000, dependsOnMethods = {"LoginToApp"})
   public void Homepage()
   {
	   System.out.println("home page test case");
	   
   }
	
  
	@Test (priority = 101 ,dependsOnMethods = {"Homepage"} )
       public void Logout()
      {
	   
	   System.out.println(" logout test case");
      }
	
	
	
	
}
