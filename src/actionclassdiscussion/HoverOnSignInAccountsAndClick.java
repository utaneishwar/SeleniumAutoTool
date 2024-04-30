package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class HoverOnSignInAccountsAndClick {

	public static void main(String[] args)
	{
	// WAP to hover on sign in accounts and lists and click on sign in button 

//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
		WebDriver driver = BaseTest.LaunchBrowser("https://www.amazon.in/");
	WebElement hoversignaccount = driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(hoversignaccount).perform();
		driver.findElement(By.xpath("//*[@class='nav-action-inner']")).click();
		
		
		
		
		WebElement username = driver.findElement(By.xpath("//*[@id='ap_email']"));
		username.sendKeys("utaneishwar@gmail.com");
		
		
	    driver.findElement(By.xpath("//*[@id='continue']")).click();
	    
	    
	    
		WebElement passwaord = driver.findElement(By.xpath("//*[@id='ap_password']"));
		
		 passwaord.sendKeys("Ishwar@123");
		 
		 
		 driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		
		//will get sign in and click on that 
		// will open sign in page 
		//
	}

}
