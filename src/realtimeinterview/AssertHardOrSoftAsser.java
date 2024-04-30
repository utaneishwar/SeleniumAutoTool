package realtimeinterview;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import testngdiscussion.DependsOnMethod;



public class AssertHardOrSoftAsser
{
	// concept of HardAssert
	@Test(priority=1 )
	public void m1()
	{
		System.out.println(" m1 test case pass");
		SoftAssert sa =new SoftAssert();
    	sa.assertEquals(false, true);  // false
//		
	    sa.assertAll();
//		
//		 Assert.assertEquals("Mayur","mayur"); // true
		System.out.println("hard assert fail");
	}
	@Test(priority=2)
	public void m2()
	{
		System.out.println("Test case 2");
	}
	public static void main(String[] args) {



	}

}
