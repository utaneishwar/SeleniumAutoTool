package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class AmazonCarausal 
{

	@Test
	public void CarausalTest()
	{
	 WebDriver driver = BaseTest.LaunchBrowser("https://www.amazon.in/");
	 driver.findElement(By.xpath("//*[@class='a-carousel-card']//div[@id='gw-ftGr-desktop-hero-3']//*[@class='a-link-normal']")).click();
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	 
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='a-carousel-card']//div[@id='gw-ftGr-desktop-hero-3']//*[@class='a-link-normal']")));
	        
	WebElement carousalElement = driver.findElement(By.xpath("//*[@class='a-carousel-card']//div[@id='gw-ftGr-desktop-hero-3']//*[@class='a-link-normal']"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", carousalElement);
	            
	 driver.findElement(By.xpath("//*[@class='a-carousel-card']//div[@id='gw-ftGr-desktop-hero-3']//*[@class='a-link-normal']")).click();
	 	
	}
	
	
	
}
