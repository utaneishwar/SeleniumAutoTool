package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste_forPractice {

	public static void main(String[] args) 
	{
		//how to perform copy and paste by using action class
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement i = driver.findElement(By.xpath("//*[@name='firstname']"));

		Actions act = new  Actions(driver);
		act.click(i).perform();
		//to ctrl c
		act.sendKeys("ishwar").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		//To ctrl v
		act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		act.sendKeys(Keys.TAB).sendKeys("8788584611").sendKeys(Keys.TAB).sendKeys("8788584611").build().perform();



	}

}
