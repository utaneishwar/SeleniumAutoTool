package realtimeinterview;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class DataProvider 
{
	@Test (dataProvider = "logintest")
	public void LoginTest(String username,String password) throws InterruptedException
	{
		WebDriver driver=BaseTest.LaunchBrowser("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='oxd-text oxd-text--p'])[9]")).isDisplayed());
		Thread.sleep(3000);
		driver.quit();
	}
	@org.testng.annotations.DataProvider(name="logintest")
	public String [][] login()
	{
		String [][] data= new String [2][2];
		data[0][0]= "Admin";
		data[0][1]= "admin123";
		data[1][0]= "Admin";
		data[1][1]= "Test123";
		return data;
	}


}


