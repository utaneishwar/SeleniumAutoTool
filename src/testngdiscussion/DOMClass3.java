package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class DOMClass3 
{
   WebDriver driver ;
  @Test
   public void url()
   {
	   driver=BaseTest.LaunchBrowser("https://www.amazon.in/");
	
   }
	

}
