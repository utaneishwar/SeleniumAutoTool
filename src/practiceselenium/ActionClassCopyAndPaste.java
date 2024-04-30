package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassCopyAndPaste {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();

		driver .manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");

		WebElement firstname = driver .findElement(By.xpath("//*[@name='firstname']"));
		firstname .click(); firstname.sendKeys("ishwar");

		Actions act =new Actions (driver);

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).
		keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).
		sendKeys(Keys.TAB).
		keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();


		act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").build().perform();



	}

}
