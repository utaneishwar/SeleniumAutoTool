package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;
import realtimeinterview.ActionClass;

public class UseOfKeysUPAndKeysDown {

	public static void main(String[] args) {
		WebDriver driver=BaseTest.LaunchBrowser("https://www.facebook.com/signup");
		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		//Thread.sleep(2000);
		firstname.click();
		Actions act =new Actions(driver);
		act.sendKeys("ishwar").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
		.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL)
		.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
