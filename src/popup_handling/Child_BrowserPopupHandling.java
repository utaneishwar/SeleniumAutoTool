package popup_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basicpackage.BaseTest;

public class Child_BrowserPopupHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		// 2)CHILD POPUP: we can inspect this popup (using locator)in normal way 
		// there have no additional method and no freeze to any component over the webpage 
		
	WebDriver driver = BaseTest.LaunchBrowser("https://groww.in/");
		
	  driver.findElement(By.xpath("//*[@class='absolute-center btn51ParentDimension']//span[text()='Login/Register']")).click();
      driver.findElement(By.xpath("//*[@id='login_email1']")).sendKeys("velocity@gmail.com");

	  driver.findElement(By.xpath("//*[text()='Continue']"));
	  Thread.sleep(2000);
	
	  driver.findElement(By.xpath("//*[@class='rodal-close']")).click();
	  
	}

}
