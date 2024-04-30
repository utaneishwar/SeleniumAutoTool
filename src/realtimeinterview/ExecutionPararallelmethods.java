package realtimeinterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExecutionPararallelmethods
{
	@Test(priority=1)
	public void facebook()
	{
		WebDriver 
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		System.out.println("launche facebook");
	}
	@Test(priority=2)
	public void google()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("launch google");
	}
	@Test(priority=3)
	public void MMT()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println("launch mmt");
	}


}
