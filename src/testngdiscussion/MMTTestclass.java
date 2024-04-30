package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class MMTTestclass 
{


	static WebDriver driver; 
	@Test
	public void SearchFlight() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions cop = new ChromeOptions();
		cop.setBinary("C:\\Users\\intel\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver =new ChromeDriver(cop);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");

		//driver = BaseTest.LaunchBrowser("https://www.makemytrip.com/");
		Thread.sleep(3000);
		WebElement searchbutton = driver.findElement(By.xpath("//*[text()='Search123']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", searchbutton);

	}

}


