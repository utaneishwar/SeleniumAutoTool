package tusharpracticeset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicpackage.BaseTest;



public class datepick {

	
		public static void main(String[] args) {
			
			WebDriver driver = BaseTest.LaunchBrowser("https://jqueryui.com/datepicker/");
			
			WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
			
			driver.switchTo().frame(iframe);
			
			driver.findElement(By.xpath("//*[@id='datepicker']")).click();
			
			String actual = "May 2022";
			
			while(true)
			{
				String expected = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
				
				if(!(expected.equals(actual)))
				{
					driver.findElement(By.xpath("//*[text()='Prev']")).click();
				}
				else
				{
					break;
				}
			}
			
			driver.findElement(By.xpath("(//*[@data-handler='selectDay'])[14]")).click();
		}
	}


