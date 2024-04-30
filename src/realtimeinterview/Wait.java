package realtimeinterview;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Wait
{
	@Test(priority=1,enabled=false)
	public void cliclonLink()
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("india");

		Actions act =new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();

		// Concept of Implicit wait /// if we not applied this wait then it will throw nosuchelement exception
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//*[@class='wM6W7d'])[7]")).click();



	}
	@Test (priority=2,enabled=false)
	public void ExplicitWait()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='enable-button']"))).click();
    }
	
	@Test(priority=3)
	public void Fluentwait()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		FluentWait<WebDriver> wait =new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofSeconds(9))
		.withTimeout(Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='display-other-button']"))).click();
	}

}
