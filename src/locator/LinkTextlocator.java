package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextlocator {

	public static void main(String[] args)
	{
		// 4) LinkText(): this is a method inside BY class we can perform action over a link 
		//on the basis of its name 
		

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/client");
		
	 
	 WebElement forgetpwd = driver.findElement(By.linkText("Forgot password?"));
	      forgetpwd.click();
	

	}

}
