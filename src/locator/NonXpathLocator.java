package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NonXpathLocator {

	public static void main(String[] args) 
	{
// id : it is a method located inside a "By" class which is representing inside the node using id attributes


		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
	WebElement carticon=driver.findElement(By.id("nav-cart-count"));
		
		
		carticon.click();
		

	}

}
