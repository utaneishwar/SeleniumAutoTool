package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class CopyAndPaste {

	public static void main(String[] args) 
	{ // To perform kyeboard action copy and paste 
		//		
		//	WebDriver driver = new ChromeDriver();
		//	driver.manage().window().maximize();
		//	driver.get("https://www.facebook.com/signup");

		WebDriver driver = BaseTest.LaunchBrowser("https://www.facebook.com/signup");

		WebElement firstname = driver.findElement(By.xpath("//*//*[@name='firstname']"));

		Actions act = new Actions(driver);
		act.click(firstname).perform();

		// To ctr+a : for select ctr area and lift press from ctrl key this is logic

		act.sendKeys("Jan batch")
		.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		// To ctr+c: for select ctrl  c and lift press from ctrl key this is logic

		act.keyDown(Keys.CONTROL).sendKeys("c")
		.keyUp(Keys.CONTROL).build().perform();

		//To press tab and past to another webelement like firstname to last name 

		act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL)
		.sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v")
		.keyUp(Keys.CONTROL).build().perform();


	}

}
