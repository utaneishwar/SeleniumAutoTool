package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParalleTestClass2 
{
	@Test
	public void testcase3() 
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		ChromeOptions cop = new ChromeOptions();
//		cop.setBinary("C:\\Users\\intel\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
//		WebDriver driver =new ChromeDriver(cop);
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
		
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com");
		
		//driver.get("https://www.google.com/");
	}
	
	
	@Test
	public void testcase4() 
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		ChromeOptions cop = new ChromeOptions();
//		cop.setBinary("C:\\Users\\intel\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
//		WebDriver driver =new ChromeDriver(cop);
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
		
		
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	
}
}
