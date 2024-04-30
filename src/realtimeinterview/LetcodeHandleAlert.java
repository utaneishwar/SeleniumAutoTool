package realtimeinterview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class LetcodeHandleAlert {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = BaseTest.LaunchBrowser("https://letcode.in/alert");
		
		
		Actions act =new Actions(driver);
	    driver.findElement(By.xpath("//*[text()='Simple Alert']")).click();
		driver.switchTo().alert().accept();
		driver.navigate().refresh();             // handle the refresh operation 
	    System.out.println("1 way refresh");
		Thread.sleep(9000);
		
		// 2nd way refresh
		driver.findElement(By.xpath("//*[text()='Confirm Alert']")).click();
		driver.switchTo().alert().dismiss();
	//	act.keyDown(Keys.CONTROL).sendKeys("R").keyUp(Keys.CONTROL).build().perform(); // not handle
		System.out.println("2nd way refresh");
		Thread.sleep(9000);
		
		                                   // for class  ===== tagname.<value>
		// 3rd way refresh                 // for id only  === tagname#<value>
		driver.findElement(By.cssSelector("button#prompt")).click();   // here i am using css selector
		driver.switchTo().alert().sendKeys("Ishwar");
		driver.switchTo().alert().accept();
      //	act.keyDown("fn").sendKeys(Keys.F5).keyUp("fn").build().perform();  // doesnt handle 
		System.out.println("3rd way Refresh");
	}

}
