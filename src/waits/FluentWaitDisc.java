package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class FluentWaitDisc 
{
	@Test
	public void fluentWaitTest()
	{
		WebDriver driver = BaseTest.LaunchBrowser("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.pollingEvery(Duration.ofMillis(100))
				.withTimeout(Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='enable-button']")));
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
	}
}
