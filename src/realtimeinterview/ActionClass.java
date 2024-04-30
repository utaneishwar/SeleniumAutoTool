package realtimeinterview;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions cop = new ChromeOptions();
		cop.setBinary("C:\\Users\\intel\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");

		WebDriver driver =new ChromeDriver(cop);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");


		WebElement name = driver.findElement(By.xpath("//*[@name='firstname']"));
		name.sendKeys("ishwar");

		Actions act = new Actions(driver);

		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)
		.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL)
		.sendKeys(Keys.TAB)
		.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL)
		.build().perform();

		act.sendKeys(Keys.TAB)
		.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();



	}

}
