package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class AssignmentTestCasesCreateXmlFile 
{
	WebDriver driver;
	
	
   @Test (priority=1)
    public void NavToUrl()
    {
       driver =BaseTest.LaunchBrowser("https://www.amazon.in/");	
    }
    
    @Test (priority=2)
    public void LoginToApp()
    {
    	driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']")).click();
    
    
    }
  
//
////output will get:PASSED: NavToUrl
//    PASSED: LoginToApp
//
//    ===============================================
//        Default test
//        Tests run: 2, Failures: 0, Skips: 0
//    ===============================================
//










}
      
