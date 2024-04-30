package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import basicpackage.BaseTest;

public class SoftAssertExample 
{

	// Soft Assert is the type of assertion 
	@Test
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions cop = new ChromeOptions();
		cop.setBinary("C:\\Users\\intel\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		WebDriver driver =new ChromeDriver(cop);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");   // this page not loaded
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobile");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();


		String titleOfpage = driver.getTitle();   
		System.out.println(titleOfpage );          // Amazon.in : mobile
		boolean ispresent = titleOfpage.contains("mobiile");
		System.out.println(ispresent);                 // false



		// applying Soft  assert   : required Object for performing  soft assertion 

		SoftAssert sa = new SoftAssert();         // object create so it is nonstatic assert
		sa.assertEquals(titleOfpage,"Amazon.in : mobiile");
		System.out.println("After Assertion code ");       // it will executed in soft assertion 

		sa.assertEquals(ispresent,"Mobile");      // test case will get passed because expected result match with actual result
		System.out.println("my name is Ishwar"); 
		sa.assertAll();                          // this method comulsorily when we apply soft assertion 




		//		output is :         Amazon.in : mobile
		//		         false
		//		         After Assertion code 
		//		         FAILED: login
		//		         java.lang.AssertionError: The following asserts failed:
		//		         	expected [Amazon.in : mobiile] but found [Amazon.in : mobile]
	}

}
