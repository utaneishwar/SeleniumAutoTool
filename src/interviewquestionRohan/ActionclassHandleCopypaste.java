package interviewquestionRohan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionclassHandleCopypaste {

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 WebElement username = driver.findElement(By.xpath("//*[@type='text']"));
		username.click();
		
		Actions act =new Actions(driver);
		act.sendKeys("utaneishwar");
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.TAB).
		keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	}

}
