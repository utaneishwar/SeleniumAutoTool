package tusharpracticeset;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionByKeypadAndfMouse 

{
	// Automated the home Simple page Test
	public static void main(String[] args) throws InterruptedException  {


		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/samplepagetest");
		// WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));

		driver.findElement(By.xpath
				("//*[@type='file']")).sendKeys("C:\\Users\\intel\\Desktop\\WhatsApp Image 2023-04-28 at 13.10.11.jpg");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='name']")).sendKeys("ishwar");
		driver.findElement(By.xpath("//*[@id='g2599-email']")).sendKeys("utaneishwar@gmail.com");
		driver.findElement(By.xpath("//*[@id='g2599-website']")).sendKeys("https://www.facebook.com/");



		WebElement dropdown = driver.findElement(By.xpath("//*[@class='select']"));
		dropdown.click();
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement checkbox = driver.findElement(By.xpath("//*[normalize-space(text())='Automation Testing']"));
		wait.until(ExpectedConditions.elementToBeClickable(checkbox)).click();

		driver.findElement(By.xpath("(//*[@class='radio'])[1]")).click();
		driver.findElement(By.xpath("//*[@id='contact-form-comment-g2599-comment']"))
		.sendKeys(" Automation testing is done" );
		driver.findElement(By.xpath("//*[@class='pushbutton-wide']")).click();
		driver.findElement(By.xpath("//*[@name='file-553']")).sendKeys("C:\\Users\\intel\\Desktop\\WhatsApp Image 2023-04-28 at 13.10.11.jpg");






	}
}
