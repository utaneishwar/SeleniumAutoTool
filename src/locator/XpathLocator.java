package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	public static void main(String[] args)
	{  // xpath locator 

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		
		
		WebElement username = driver.findElement(By.xpath("//input[@type='email']"));
            username.sendKeys("utaneishwar@gmail.com");
            
		
            WebElement password = driver.findElement(By.xpath("//input[@placeholder='enter your password']"));
            password.sendKeys("Ishwar@123");
            
	
	}

}
