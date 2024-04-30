package tusharpracticeset;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionClassByMouseAndKeyboard {

	public static void main(String[] args) 
	{
		// To perform End end Flow of facebook page 	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		firstname.sendKeys("Ishwar");
		
		Actions act =new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
		.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL)
		.sendKeys(Keys.ENTER)
		.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL)
		
		.sendKeys(Keys.TAB).sendKeys("utaneishwar@gmail.com")
		.sendKeys(Keys.TAB).sendKeys("utaneishwar@gmail.com")
		.sendKeys(Keys.TAB).sendKeys("Ishwar@1234").build().perform();
		
		Select  day = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		day.selectByVisibleText("5");

		Select month   = new Select(driver.findElement(By.xpath("//*[@id='month']")));
		month.selectByValue("10");

		Select year  = new Select( driver.findElement(By.xpath("//*[@id='year']")));
		year.selectByIndex(30);

		WebElement male = driver.findElement(By.xpath("(//*[@type='radio'])[2]"));
		male.click();
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
		.sendKeys(Keys.ENTER).build().perform();


	}

}
