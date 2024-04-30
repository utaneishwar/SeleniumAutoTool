package realtimeinterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import basicpackage.BaseTest;

public class DatePicker
{

	public static void main(String[] args) 
	{
//		ChromeOptions option =new ChromeOptions();
//		option.setBrowserVersion("116.0.5845.97");
		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://jqueryui.com/datepicker/");

		WebDriver driver = BaseTest.LaunchBrowser("https://jqueryui.com/datepicker/");
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);

		driver.findElement(By.xpath("//*[@id='datepicker']")).click();

		String actual = "August 2022";

		while(true)
		{
			String expected = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText(); 
			if(expected.equals(actual))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[text()='Prev']")).click();
			}

		}
		driver.findElement(By.xpath("(//*[@class='ui-state-default'])[11]")).click();


	}

}
