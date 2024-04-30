package testngdiscussion;

import org.testng.annotations.Test;

public class DPTest 
{
	@Test (dataProvider="TestData", dataProviderClass=testngdiscussion.DPclass.class )
	public void testcase(String s1, String s2) 
	{
		System.out.println(s1+" "+s2);
	}
}
