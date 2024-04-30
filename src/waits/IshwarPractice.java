package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dev.failsafe.Timeout;

public class IshwarPractice 
{
 WebDriver driver ;
 WebDriverWait wait;
 
	@BeforeClass 
	public void Chromedriver()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	}
	@Test(priority=1)
	public void alert()
	{
		driver.findElement(By.xpath("//*[@id='alert']")).click();
		wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().dismiss();
	}
	
	@Test(priority=2)
	public void text ()
	{
		driver.findElement(By.xpath("//*[@id='populate-text']")).click();
		wait=new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.textToBe((By.xpath("//*[text()='Selenium Webdriver']")),null));
		
	}
	@Test(priority=3)
	public void enable()
	{
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		wait=new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[text()='Enabled']")));
	}
	@Test(priority=4)
	public void Enable()
	{
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='disable']")));
	}
	@Test(priority=5)
	public void Checkbox()
	{
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='ch']"))).click();
	}
		
		
	}

