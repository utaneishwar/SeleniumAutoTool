package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//*[@id='datepicker']")).click();
		String actual="July 2023";
		
		
		while(true)
		{
			WebElement expected = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']"));
			String actualvalue = expected.getText();
			if(!(actual.equals(actualvalue)))
			{
				driver.findElement(By.xpath("//*[text()='Prev']")).click();
				
			}
			else
			{
				break;
			}
		}
		driver.findElement(By.xpath("//*[@data-handler='selectDay']//*[text()='21']")).click();
				
	}

}
