package testngdiscussion;

import org.testng.annotations.Test;

public class DOMClass1 
{
	@Test(priority=1)
    public void login()
	{
		System.out.println("log in test case ");
	}
	
	  @Test (priority=2)
	  public void homepage()
	  {
		System.out.println("home page test case ");
		throw new ArithmeticException();
	   } 
	  }
