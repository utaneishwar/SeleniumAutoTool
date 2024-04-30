package tusharpracticeset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class getAttribute_concept {

	public static void main(String[] args) 
	{
		//getAttrbute : this method return String value by providing attribute name inside Argument of the method
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com//signup");

		WebElement firstname = driver.findElement(By.xpath("//*[@type='text' and @name='firstname']"));
		firstname.sendKeys("ishwar");
		String text = firstname.getAttribute("value");
 
		System.out.println(text);
		 Assert.assertEquals(text, "ishwar");

	}
}
