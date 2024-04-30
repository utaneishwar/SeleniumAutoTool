package realtimeinterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IsDispaly 
{
	@Test(priority=1)
	public void amazon()
	{
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement carticon = driver.findElement(By.xpath("//*[@id='nav-cart-count']"));
		boolean isdisplay = carticon.isDisplayed();
		System.out.println(isdisplay);    // true 
		WebElement hiddenElement = driver.findElement(By.xpath("//*[@id='glowValidationToken']"));
		boolean res = hiddenElement.isDisplayed();
		System.out.println(res);           // false
	}

	@Test(priority=2,dependsOnMethods = {"amazon"})
	public void ama()
	{
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement searchbox= driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		boolean isenable =searchbox.isEnabled();
		System.out.println(isenable);
		

	}
	
	@Test(priority=3,groups = "regression")
	public void amaz()
	{
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		WebElement notselected= driver.findElement(By.xpath("//*[@type='checkbox']"));
		
	 	boolean notsel=notselected.isSelected();
		System.out.println(notsel);
		
		      notselected.click();
		      
		boolean isselected =notselected.isSelected();
		System.out.println(isselected);
		
		// note we can execute this from xml file name is IsDisplayed
	}
}
