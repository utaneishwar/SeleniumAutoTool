package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchFlightTestng 
{
 static WebDriver driver;
	@Test
	public void Testcase1() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	WebElement searchbutoon = driver.findElement(By.xpath("//*[text()='Search123']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
    }
	

}
