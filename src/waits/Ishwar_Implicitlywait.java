package waits;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class Ishwar_Implicitlywait {

	public static void main(String[] args) 
	{

		//WebDriver driver = new ChromeDriver();
		
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
		WebDriver driver = BaseTest.LaunchBrowser("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("india");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		try {
			driver.findElement(By.xpath("//*[@class='a5RLac']")).click();
		} catch (ElementNotInteractableException e) {
			System.out.println("runtimeexception");
		}
		
		////*[@id='dimg_11']
		//driver.findElement(By.xpath("//*[@id='dimg_11")).click();
	}

}
