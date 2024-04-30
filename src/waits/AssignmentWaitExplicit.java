package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class AssignmentWaitExplicit
{
	WebDriver driver;
	
	
	@Test(priority=1)
	public void Openalert()
	{
	 driver = BaseTest.LaunchBrowser("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	driver.findElement(By.xpath("//*[@id='alert']")).click();
	
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(60));
	wait.until(ExpectedConditions.alertIsPresent());
	
	// driver.findElement(By.xpath("//*[@id='alert']")).click();
	driver.switchTo().alert().accept();                         //we can handle the alert by using both code
	}
	
	@Test(priority=2)
	public void changetext()
	{
	
	driver.findElement(By.xpath("//*[@id='populate-text']")).click();
	
	WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(120));
	wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id='populate-text']"), null));
	}
	@Test(priority=3)
	public void m3() {
	   driver.findElement(By.xpath("//*[@id='display-other-button']")).click();

	   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='display-other-button']")));
	
	   }
	@Test(priority=4)
	public void DisplayButton()
	{
	
	driver.findElement(By.xpath("//*[@id='checkbox']")).click();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='checkbox']")));

}}
