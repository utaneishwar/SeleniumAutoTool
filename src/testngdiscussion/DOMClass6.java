package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class DOMClass6 
{
   WebDriver driver;
   
    @Test  (priority=1)
   public void m1()
   {
	   driver = BaseTest.LaunchBrowser("https://www.globalsqa.com/samplepagetest/");
      Actions act = new Actions(driver);
       act.click().perform();
       throw new ArithmeticException(); 
	    
   }
   
   @Test (priority=2)
   public void m2()
   {
	   driver.findElement(By.xpath("//*[@id='g2599-name']")).sendKeys("ishwar");
	   throw new ArithmeticException(); 
   }
	
}
