package mockParameterisation;

import org.openqa.selenium.WebDriver;


import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class Chrome {

	@Test
	public void C()
	{
		//WebDriver driver =new ChromeDriver();
		WebDriver driver = BaseTest.LaunchBrowser("https://www.google.com/");
//		driver.manage().window().maximize();
//		driver.get("");
		
	}
	@Test
	public void C1()
	{
		//WebDriver driver =new ChromeDriver();
		WebDriver driver = BaseTest.LaunchBrowser("https://www.flipkart.com/");
//		driver.manage().window().maximize();
//		driver.get("");
		
	}


}
