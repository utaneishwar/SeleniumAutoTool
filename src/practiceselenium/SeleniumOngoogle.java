package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOngoogle {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("selenium");
		Thread.sleep(2000);
		//List<WebElement> allvalue = driver.findElements(By.xpath("//*[text()='selenium']"));
		List<WebElement> allvalue = driver.findElements(By.xpath("//*[@class='erkvQe']//div//li"));
		WebElement elementvalue=null;

		for(WebElement value:allvalue)
		{
			String printvalue = value.getText();
			System.out.println(printvalue);
			if(printvalue.equals("selenium webdriver"))
			{
				elementvalue=value;
			}
		}
		elementvalue.click();
	}

}
