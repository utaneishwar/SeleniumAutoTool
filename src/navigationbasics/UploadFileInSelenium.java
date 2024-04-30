package navigationbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileInSelenium {

	public static void main(String[] args)
	{
	 // choose file from any folder by using path only 
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
	
		driver.findElement(By.xpath("//*[@name='upload']"))
		.sendKeys("C:\\Users\\intel\\Desktop\\RECEIPT VELOCITY.pdf");
		
		
		
		

	}

}
