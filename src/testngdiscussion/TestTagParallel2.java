package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class TestTagParallel2 
{
	@Test
	public void google()
	{
		WebDriver driver = BaseTest.LaunchBrowser("https://www.google.com/");		
		
	}

}
