package popup_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basicpackage.BaseTest;

public class ASS_AlertPopupHandling {

	public static void main(String[] args) throws InterruptedException
	{
      
		// Assignment :WAP to first get the text over the pop up and then handle it.
		
		
		 WebDriver driver = BaseTest.LaunchBrowser("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");	
	 
		
		   driver.findElement(By.xpath("//*[@class='col-lg-6']//input[@name='confirmation']")).click();

		  
		   String getText = driver.switchTo().alert().getText();   // for get text 
		 
		          System.out.println(getText);              // I am confirm
		 
		 
		// driver.switchTo().alert().accept();      //  For Ok
		Thread.sleep(3000) ;
		 driver.switchTo().alert().dismiss();      // for cancel 
	}

}
