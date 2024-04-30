package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

     public class Annotations
    {//It is a way to define pre-requsite and post requisite for test case,test class,test Tag,and test Suit

    @BeforeClass                             // this annotation will executed before the Exceution of anything from the Test Class 
    public void beforeClass()
    {
    	System.out.println(" Before class ");
    }
    @AfterClass                            // This Annotation will executd After the Comletion of Everything from the  test class
    public void afterClass()
    {
    	System.out.println(" After class ");
    }
    
    	 
    @BeforeMethod                          // Represent pre_requisite  // THis annotation will executed before the Execution of Every Test case 
	public void Beformethod()
	{
		System.out.println("before method");
	}
	
	@AfterMethod                          // Represent  post_Requisite   // THis annotation will executed After the Execution of Every Test case 
	public void Aftermethod()
	{
		System.out.println("After method");
	}

	@AfterTest                               // This annotation execute After  the completion of Everything from That  Test tag
	public void afterTest()
	{
		System.out.println(" after test ");
	}
	@Test                                     // test Case 1
	public void testCase1()
	{
		System.out.println("Test case 1");
	}
	
	@Test
	public void testCase2()                        // Test casde 2
	{
		System.out.println("Test case 2");
	}



//	 Before class 
//	 before method
//	 Test case 1
//	 After method
//	 before method
//	 Test case 2
//	 After method
//	 After class 
//	  after test 
//	 PASSED: testCase1
//	 PASSED: testCase2
//
//	 ===============================================
//	     Default test
//	     Tests run: 2, Failures: 0, Skips: 0
//	 ===============================================
//
  }
