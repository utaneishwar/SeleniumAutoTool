package tusharpracticeset;

import java.time.Duration;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatepickerProgram {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		driver.switchTo().frame(iframe);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

		driver.findElement(By.xpath("//*[@class='hasDatepicker']")).click();
		String actual = "July 2022";

		while(true) 
		{

			String expected = driver.findElement(By.xpath("//*class='ui-datepicker-title']")).getText();
			if(expected.equals(actual))
			{
				break;
			}
			else
			{
				WebElement back = driver.findElement(By.xpath("//*[@class='ui-datepicker-prev ui-corner-all']"));
				back.click();
			}
			}
		driver.findElement(By.xpath("//*[@data-handler='selectDay']//a[text()='14']")).click();
	}

}
