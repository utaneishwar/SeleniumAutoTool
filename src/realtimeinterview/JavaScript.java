package realtimeinterview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basicpackage.BaseTest;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException
	{
		//		WebDriver driver = new ChromeDriver();
		//		driver.manage().window().maximize();
		//		driver.get("https://www.spotify.com/us/signup");
		
		WebDriver driver = BaseTest.LaunchBrowser("https://www.spotify.com/in-en/signup");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Thread.sleep(2000);
		WebElement mail = driver.findElement(By.xpath("//*[@id='username']"));
		js.executeScript("arguments[0].value='velocity@gmail.com'", mail);
		WebElement next = driver.findElement(By.xpath("//*[text()='Next']"));
		js.executeScript("arguments[0].click();", next);
		
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//*[@id='new-password']"));
		js.executeScript("arguments[0].value='velocity@123'",password);
		
		WebElement passnext = driver.findElement(By.xpath("//*[text()='Next']"));
		js.executeScript("arguments[0].click();", passnext);
		
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		WebElement maleButton = driver.findElement(By.xpath("//*[@id='gender_option_male']"));

		js.executeScript("arguments[0].click();", maleButton);



	}

}
