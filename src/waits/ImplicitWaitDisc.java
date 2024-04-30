package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class ImplicitWaitDisc
{    
	// it is an entity to it is used to wait 2) if any pop up not handle by normal way then use JavaScriptExecutor
	
	 @Test
	 public void SearchFlight() throws InterruptedException
	   {
		WebDriver driver = BaseTest.LaunchBrowser("https://www.makemytrip.com/");
		  Thread.sleep(3000);
		 WebElement searchbutton = driver.findElement(By.xpath("//*[text()='Search']"));
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].click();", searchbutton);
		 
}
}
