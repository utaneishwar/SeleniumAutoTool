package window_handling;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class Ass_CloseAndQuitConcept {

	public static void main(String[] args) throws InterruptedException
	{
		// Close And Quit Concept Of Window Handling :
		// Close(); is used for Close the PERTICULAR WINDOW if we have want.
		//  Quit(); Is used for close the Browser means All windows will close which is open over the browser

		WebDriver driver = BaseTest.LaunchBrowser("https://www.facebook.com/signup");

		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click(); 
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click(); 


		Set<String> allwindow = driver.getWindowHandles();

		int numberofwindow = allwindow.size();   // 4

		String[] winarray=new String[numberofwindow ];

		int i = 0;

		for(String winid:allwindow)
		{
			winarray[i]= winid; 
			i++;
		}
		driver.switchTo().window(winarray[0]);
		driver.get("https://www.google.com");
		WebElement c =driver.findElement(By.name("q"));
		Thread.sleep(2000);
		c.sendKeys("myntra.com");



		Actions act = new  Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		for(int i3 = 0; i3<=20; i3++)
		{
			act.sendKeys(Keys.TAB).perform();

		}
		act.sendKeys(Keys.ENTER).perform();

                   driver.quit();

		//  driver.findElement(By.xpath("(//*[@value='Google Search'])[1]")).click();
		//  driver.close() ;   // google page will be close
		// driver.quit();     // browser will be close
		// we cannot perform at time close and Quite



	}

}
