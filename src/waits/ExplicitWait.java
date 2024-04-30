package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class ExplicitWait
{
	@Test
	public void ExplicitTest()
	{
		// Explicit wait: It is a wait for Specific condition to get occur befoe perform the action there have diff set of condition inside expectedeondition class
		// we define condition inside Untill method to implement Explicit wait we have to use webDriverWait class
		// if the Explicit wait gets faile then it will throw timeout exception 
		// Explicit wait is applicable for  disable ,clickable,selectcheck element it will be wait for that perticular time it will not show 
		WebDriver driver = BaseTest.LaunchBrowser("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");


		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		// Explicit Concept 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='disable']"))).click();

		driver.findElement(By.xpath("//*[@id='enable-button']")).click();









	}
}
