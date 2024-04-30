package testngdiscussion;

import static org.testng.Assert.expectThrows;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestngAllKeyword 
{
	@Parameters("browser")
	@Test (priority=0, invocationCount = 2)
public void LaunchBrowser(String name)
{
		
	if(name.equals("firefo"))
   {
	   System.out.println("this is firefox");
	 }
	else 
	{
	System.out.println("this is chrome");	
	}
	Reporter.log("this my name ishwar",true);
}
	
	

@Test (priority =1)
public void Login()
{
	System.out.println("login test case");
	throw new NullPointerException("login test case get failed");
}
@Test (priority =2)
public void homepage()
{
	System.out.println("homepage test case");
	
}

@Test  (priority =3,   dependsOnMethods ="Login")
public void orderpage()
{
	System.out.println("orderpage test case");
}

}
