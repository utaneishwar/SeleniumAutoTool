package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class ArrowsKeysHandling {

	public static void main(String[] args) throws InterruptedException 
	{
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
		
		WebDriver driver =	BaseTest.LaunchBrowser("https://www.google.com/");
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		// to perform down-down-enter and open
		
       act.sendKeys(Keys.ARROW_DOWN)
          .sendKeys(Keys.ARROW_DOWN) 
          .sendKeys(Keys.ENTER).build().perform();
 
		

	}

}
