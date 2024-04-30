package testngdiscussion;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2
{
	@BeforeTest                       //This annotation will executed before the Starting  of anything from the Test tag
	public void beforeTest()
	{
		System.out.println(" before Test ");
	}
	@BeforeSuite                       // This Annotation will executed before the Starting  of Anything from the XML file 
	public void beforeSuit()
	{
	System.out.println(" before Suit ");	
	}
   @AfterSuite                         // This Annoation will executed After the completion of Everything from That xml file 
   public void afterSuit()
   {
	   System.out.println(" afetr Suit ");
   }
   @Test                                 // Test Case 3
   public void testcase3() 
   {
	   System.out.println(" Tast case 3 ");
   }

}
