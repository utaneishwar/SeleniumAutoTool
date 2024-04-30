package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basicpackage.BaseTest;

public class PartialLinkText {

	public static void main(String[] args) 
	{
		// 5) PartialLinkText: it is method inside BY class throw we can locate the webElement 
		// by using partial text of the link
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver=BaseTest.LaunchBrowser("https://rahulshettyacademy.com/client");
//		driver.manage().window().maximize();
//		driver.get("https://rahulshettyacademy.com/client");
		
		WebElement forgotPwd = driver.findElement(By.partialLinkText("Forgot pass"));
		   forgotPwd .click();
	
		   
		   // fill password by using sendkeys
		   
		  WebElement usepwd = driver.findElement(By.id("userPassword"));
		  usepwd .sendKeys("Ishwar@1234");
		     
		 
	
		
		     
		

	}

}
