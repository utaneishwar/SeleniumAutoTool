package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DOMClass4 extends DOMClass3 
{
	
	@Test (priority=1)
	public void Search1()
	{
	 driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobile");
	}
	
	
	
	
	@Test (priority=2)
	public void Search2()
	{
	   driver.findElement(By.xpath("//*[@id='nav-search-submit-text']")).click();
	}
	

}
