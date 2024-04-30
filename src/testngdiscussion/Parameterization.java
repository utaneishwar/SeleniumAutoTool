package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization 
{
  //PARAMETERS: It is a way to get the value which is comes from xml file into the test case as an arguments by using an annotation is callled as @Parameters
 // SUITLEVEL parameter : there is no difference between Suit level and tag level only difference is scope 	
	
	@Parameters("browser")  
	@Test(priority=6)
	public void GetDetails(String browsername)
	{   System.out.println("value from xml file"+browsername);
		System.out.println("get details test case");
	}
	

	@Parameters({"browser","env","status"})                        // it is a way to get the values from xml file 
	@Test(priority=8)
	public void LaunchBrowser(String browsername,String e,String s)
	{
		System.out.println(s); 
		System.out.println(e);       //SIT                     // it is coming from Xml file We have to provided there value=env ,name = Sit 
		WebDriver driver ;
		if(browsername.equals("Chrome"))
		{
		driver = new ChromeDriver();	
		}
		else if(browsername.equals("Firefox"))
		{ 
		  driver = new FirefoxDriver();	
		}
		
	System.out.println("launch browser test case");	
	}
//------------------------------------------------------------	
// TAGLEVEL parameter : there is no difference between Suit level and tag level only difference is scope 	
	
	@Parameters("Taglevel")
	@Test(priority=10)
	public void Login(String tag)
	{
		System.out.println("tag level value is "+tag);
		
		System.out.println("launch browser test case");	
		
		
		
	}
// Comparision of suit level and tag level:
//	<suite name="Suite">
//	 <parameter name="browser" value="Firefox"></parameter>
//	  <parameter name="env" value="SIT"></parameter>
//	  <test thread-count="5" name="Test">
//	  <parameter name="Taglevel" value="Firsttagtesting"></parameter>
//	   <classes>
//	      <class name="testngdiscussion.Parameterization"/>
//	    </classes>
//	  </test> <!-- Test -->
//	</suite> <!-- Suite -->

	
}
