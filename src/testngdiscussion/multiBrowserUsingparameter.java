package testngdiscussion;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class multiBrowserUsingparameter 
{
     WebDriver driver;
	
	@Parameters("browser")
	@Test()
     public void login(String browsername)
    { 
	 System.out.println("value from xml file "+browsername);
		if(browsername.equals("Chrome"))
		{
		driver = new ChromeDriver();	
		}
		else if(browsername.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
	  }
	
	
//note:  we can execute same test case on multiple browser with the help of this program from xml file 
}
