package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTestClass1
{
	
	
	@Test
	public void testcase1() 
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		ChromeOptions cop = new ChromeOptions();
//		cop.setBinary("C:\\Users\\intel\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
//		WebDriver driver =new ChromeDriver(cop);
//		driver.manage().window().maximize();
//		driver.get("https://www.makemytrip.com/");
		
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.makemytrip.com/");
		
		
	}
	@Test
	public void testcase2() 
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		ChromeOptions cop = new ChromeOptions();
//		cop.setBinary("C:\\Users\\intel\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
//		WebDriver driver =new ChromeDriver(cop);
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
		
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
	}
	
}
