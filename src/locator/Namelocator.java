package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Namelocator {

	public static void main(String[] args) throws InterruptedException 
	{ 
	// name: this is method inside "By" class which is rep[resenting inside node 
		// by using name attribute
		
		ChromeDriver driver = new ChromeDriver();
		driver .get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
	
		
		WebElement username = driver.findElement(By.name("username"));
		
		username.sendKeys("Admin");
		driver.close();
		
		WebElement login =driver.findElement(By.name("login"));
		login.sendKeys("admin123");
		login.click();
	
		
		

	}
	
	
	
	
	
	
	

}
