package tusharpracticeset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ScrollByAmount {



	@Test
	public void ScrollByAmount() throws InterruptedException
	{
		WebDriver driver ; driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("(//*[@class='nav-a  '])[4]")).click();
		Actions act =new Actions(driver);
		Thread.sleep(2000);
		act.scrollByAmount(0, 8000).perform();

	}

}


