package tusharpracticeset;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization 
{   
	@Parameters("browser")
	@Test
	public void launchbrowser(String browsername)
	{
		if(browsername.equals("Chrome"))
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
		}
		else 
		{
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
		}
		
	}
	
}
