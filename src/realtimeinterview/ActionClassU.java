package realtimeinterview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class ActionClassU {

	public static void main(String[] args) 
	{
		WebDriver driver=BaseTest.LaunchBrowser("https://www.facebook.com//signup");
		WebElement fname = driver.findElement(By.xpath("//*[@name='firstname']"));
		fname.click();

		Actions act =new Actions(driver);
		act.sendKeys("ishwar").perform();
		// ctr c ctr v

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
		.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL)
		.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

	}

}
