package tusharpracticeset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
    Thread.sleep(2000);
      WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame lazyloaded']"));
      driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//*[@class='hasDatepicker']")).click();

		String actual="September 2022";

		while(true)
		{
			String expected = driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();

			if(actual.equals(expected))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}

		}
		driver.findElement(By.xpath("(//*[@data-handler='selectDay'])[9]")).click();
	}

}
