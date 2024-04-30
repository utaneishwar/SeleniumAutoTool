package testngdiscussion;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class HardAssertExample 
{ 
	//Discussion about assertion and multiple methods insides a Assert class 
	// ASSERTION: it is an object which is used to provide capabillity   
	// TO compare the expected result and actual Behaviour  of test cases 
	//there are two types of assertion
	//1)HARD ASSERT   2)SOFT ASSERT

	//HARD ASSERT: it is an assert which can be implemented by Assert class in which we have multiple method 
	// if the condition for hard assert gets fail (actual result is not matching with expected result )
	// then it will not executed the further test case and will directly marked as a test case failed 
	@Test    
	public void loginTest()
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
		System.out.println(ispresent);
		// applying hard assert 

		System.out.println("before assertion code");
		Assert.assertEquals(titleOfpage, "Amazon.in : mobiile");   // this test case will get failed 
		System.out.println("After  assertion code");             // it will not executed that is the concept of hard assert 

	} 

	// concept of  Assert.assertTrue(Boolean value): this method Expect the value inside Parameter
	//   true or false and on that basis it will mark as test cases fail or pass

	@Test(priority=1, enabled = false)
	public void getVerify()
	{
		String actual = "shopping" ;
		String Expected ="Shoppingg";

		boolean isequal = actual.equals(Expected);
		System.out.println(isequal);            // false

		//  Assert.assertTrue(isequal);            //will get test case failed it is  not match with expected and Actual

		Assert.assertTrue(isequal, "Test case failed please Raised a bug");
		// this is another method inside a assert class and it will get message when test case get failed 
		//output
		//	  [RemoteTestNG] detected TestNG version 7.4.0
		//	  false
		//	  FAILED: getVerify
		//	  java.lang.AssertionError: Test case failed please Raised a bug expected [true] but found [false] 


		Assert.assertFalse(isequal); // this is another method inside assert class 
		// and it will executed test case as pass if the parameter inside this method false 

		Assert.assertFalse(isequal, "Test case failed please Raised a bug");
		// it will also print the message if the Test cases gets  failed.


	}

	//-------------------------------------------------------





}
