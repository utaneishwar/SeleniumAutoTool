package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class DatePicker {

	public static void main(String[] args)
	{
	WebDriver driver=BaseTest.LaunchBrowser("https://jqueryui.com/Datepicker");
	WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
	//Switch into iframe
	 driver.switchTo().frame(iframe);
	 
	 String expectedmonth = "October 2022";
	 
	 //click on datepicker
	 driver.findElement(By.xpath("//*[@id='datepicker']")).click();
     
		
	   while(true)
	    {
	    
	    	//month and year  select at time  
		   
	     String monthyear = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
	
	            if(!(monthyear.equals(expectedmonth)))
	             {    //! Apr2023==October 2022
	            	
		            driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	             }
	             else 
	            {
		       break;
	            }
	      
	    }   driver.findElement(By.xpath("//*[@data-handler='selectDay']//a[text()='5']")).click();
     
		
		
	  }


}
