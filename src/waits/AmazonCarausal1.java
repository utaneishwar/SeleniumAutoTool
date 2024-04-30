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

public class AmazonCarausal1
{

	@Test
	public void m1()
	{
		WebDriver driver = BaseTest.LaunchBrowser("https://www.amazon.in/");
		driver.findElement(By.xpath("(//*[@class='a-carousel-card']//*[@class='a-link-normal'])[2]")).click();
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(100));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='a-carousel-card']//*[@class='a-link-normal'])[2]")));
	  
	WebElement carausal = driver.findElement(By.xpath("(//*[@class='a-carousel-card']//*[@class='a-link-normal'])[2]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeAsyncScript("arguments[0].click", carausal);
	
}
}
