package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicpackage.BaseTest;

public class DatepickerProgramForPractice {

	public static void main(String[] args) 
	{
		//datepicker program assignment 
		WebDriver driver = BaseTest.LaunchBrowser("https://jqueryui.com/Datepicker");
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		String expectedmonth = "December 2018";
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
	while(true)	
	{
	 String monthyear = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
       
	   if(monthyear.equals(expectedmonth)) 
        {
        break;
        }
	   else 
	   {
		 driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
	   }
	  	 
	} driver.findElement(By.xpath("(//*[@data-handler='selectDay'])[1]")).click();
	
	
	
	}

}
