package tusharpracticeset;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicXpath
{
	@Test
	public void launchbrowser()
	{
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
		driver.get("");	
	}

	public static void main(String[] args) 
	{
		

	}

}
