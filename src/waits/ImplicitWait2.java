package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class ImplicitWait2
{
	// Concept of implicitWait: it is used for wait to findout the element by providing time if it findout in providing time then test case passed other wise it will give noSuchelement exception
	@Test
	public void google() throws InterruptedException
	{
		WebDriver driver = BaseTest.LaunchBrowser("https://www.google.com/");
		//driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("india");

		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[text()='Air India'])[1]")).click();

	}

}
