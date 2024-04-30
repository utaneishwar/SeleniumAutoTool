package actionclassdiscussion;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args)
	{//  Field text on facebook signup page by using keyboard action
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		
		
		driver.findElement(By.xpath("//*[@name='firstname']")).click();
	
	  	  Actions act = new Actions(driver);
		  act.sendKeys("velocity").perform();
	 
		act.sendKeys(Keys.TAB).sendKeys("corporate").build().perform();
		act.sendKeys(Keys.TAB).sendKeys("8788584611").build().perform();
		act.sendKeys(Keys.TAB).sendKeys("Pass@123").build().perform();

	}

}
