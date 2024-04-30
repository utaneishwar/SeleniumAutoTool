package tusharpracticeset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DiscussionOfActionsClass {
	static WebDriver driver ;
	@Test (priority=1)
	public static void scrollOperation() throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement electronics = driver.findElement(By.xpath("//*[text()='Electronics devices for home office']"));

		Actions act =new Actions(driver);

		act.scrollToElement(electronics).perform();
		
		WebElement upward = driver.findElement(By.xpath("(//*[@class='nav-a  '])[4]"));
		Thread.sleep(2000);
	act.scrollToElement(upward);
	}
	
	

}
