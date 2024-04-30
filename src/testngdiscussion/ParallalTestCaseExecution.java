package testngdiscussion;

import org.testng.annotations.Test;

public class ParallalTestCaseExecution
{ // we can execute the test case parallely by providing parameter in xml file after the test(tag level)
	// as a parallel="methods", parallel="classes",  parallel="tests" 
	
	@Test
	public void testcase1() 
	{
		System.out.println("test case 1 ");
	}
	@Test
	public void testcase2() 
	{
		System.out.println("test case 2 ");
	}
	@Test
	public void testcase3() 
	{
		System.out.println("test case 3 ");
	}
	
//	output:   test case 3 
//	           test case 2 
//	            test case 1 
//	  check report 1)refresh project then go to testo/p and 

//Class	Method	Start	Time (ms)
//Suite
//Test — passed
//testngdiscussion.ParallalTestCaseExecution
//testcase1	1682597019890	7
//testcase2	1682597019890	7
//testcase3	1682597019890	7

}

