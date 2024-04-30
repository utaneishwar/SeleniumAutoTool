package realtimeinterview;

import org.apache.commons.collections4.functors.WhileClosure;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicpackage.BaseTest;

public class DatePicker1 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = BaseTest.LaunchBrowser("https://jqueryui.com/datepicker/");
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);

		driver.findElement(By.xpath("//*[@type='text']")).click();
		String actual = "October 2020";


		while(true)
		{  
			WebElement expected = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']"));
			String expecteddate = expected.getText();
			System.out.print( expecteddate+" , ");
			//January 2024 , December 2023 , November 2023 , October 2023 , September 2023 , August 2023 , July 2023 , June 2023 , May 2023 ,
			//  may 2023 == may2023
			if(expecteddate.equals(actual))
			{ 
				break;
			} 
			else
			{
				WebElement previousbutton = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]//*[@class='ui-icon ui-icon-circle-triangle-w']"));
				previousbutton.click();  
			}
		}
		driver.findElement(By.xpath("(//*[@class='ui-state-default'])[1]")).click();




	}

}
