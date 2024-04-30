package window_handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basicpackage.BaseTest;

public class WindowHandlingforPracticePurpose 
{

	public static void main(String[] args)
	{
      WebDriver driver = BaseTest.LaunchBrowser("https://www.facebook.com/signup");
	    String parentid = driver.getWindowHandle();
	    driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
	    
	    System.out.println(parentid);
	  Set<String> allwindow = driver.getWindowHandles();
	     
	  System.out.println(allwindow);
	  
	  for(String winid:allwindow)
	  {
		if(!(parentid.equals(allwindow)))
				{
			    driver.switchTo().window(parentid); // switch in parent id 
			      
				}
		
	  }
	     driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("utane");
	  
	  
	    // (//*[@type='text'])[1]
	    

	}

}
