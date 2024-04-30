package realtimeinterview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basicpackage.BaseTest;

public class Selenium {

	public static void main(String[] args) throws InterruptedException 
	{
//
//		ChromeOptions opt =new ChromeOptions();
//        opt.addArguments("--remote-allow-origins=*");
//		 
//        Thread.sleep(2000);
//		
//        WebDriver driver =new ChromeDriver();
//		driver.get("https://www.google.com/");
		
		
		WebDriver driver =BaseTest.LaunchBrowser("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//*[text()='selenium']"));

		WebElement print = null;
		for(WebElement element:elements)
		{
			String text = element.getText();
			System.out.println(text);

			if(text.equals("selenium interview questions"))
			{
				print=element;
			}
		}
		print.click();
	}
}
