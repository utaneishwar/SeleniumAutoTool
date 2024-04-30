package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException
	{  //1) id locator:this is a method inside BY class which is representing inside a node using id attributes
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("userEmail"));
		
		 username.sendKeys("utaneishwar@gmail.com");
		
		 WebElement Password = driver.findElement(By.id("userPassword"));
		 
		 
		Password.sendKeys("Ishwar@123");
		Thread.sleep(3000);
       WebElement loginbutton = driver.findElement(By.linkText("//*[@id='login']"));
		
		loginbutton.click();
	
		
		
		
		
		
		
		
	}

}
