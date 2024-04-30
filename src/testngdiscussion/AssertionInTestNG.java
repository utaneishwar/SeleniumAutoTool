package testngdiscussion;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class AssertionInTestNG
{
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions cop = new ChromeOptions();
		cop.setBinary("C:\\Users\\intel\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");

		WebDriver driver =new ChromeDriver(cop);
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");	
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();


		String titleOfpage = driver.getTitle();   
		System.out.println(titleOfpage );          // Amazon.in : mobile

		boolean ispresent = titleOfpage.contains("mobiile");   

		System.out.println(ispresent);             // false because "mobiile" not match with mobile word  


		// Applying Assertion for vallidation 
		//1)
		// false   true
		Assert.assertEquals(ispresent, true);    // if we write false instead of true then it will get also pass test case 
		//note: value present in ispresent is "false" and i,e actual result "false" and true is expected result so 
		// our test case will get executed as a fail.  


		//OP:FAILED: login
		// 	java.lang.AssertionError: expected [true] but found [false]

		//---------------------------------------  	
		//2) assertion      
		// actual result   expected result 
		Assert.assertEquals(titleOfpage,"Amazon.in : mobile");   //test case passed 

		//note: wiil get our test case is pass because expected and actual result is match due to applying this assertion so
		//o/p is == PASSED: login

	}


}
