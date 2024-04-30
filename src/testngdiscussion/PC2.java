package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PC2 
{
	@Test
	public void m3()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
	}
	
}
