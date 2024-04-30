package tusharpracticeset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GlobalSQA

{
	public void m1()
	{
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/samplepagetest/");
		 driver.findElement(By.xpath("//*[@type='file']")).sendKeys("C:\\Users\\intel\\Desktop");
	             
		driver.findElement(By.xpath("//*[@id='g2599-name']")).sendKeys("ishwar");
	driver.findElement(By.xpath("//*[@id='g2599-email']")).sendKeys("utaneishwar@gmail.com");
	WebElement website = driver.findElement(By.xpath("//*[@for='g2599-website']"));
	      website.sendKeys("Amazon.com");
	       website.click();
	       
	       
		
	}
       public static void main(String[] args) 
     {
	 GlobalSQA page=new GlobalSQA();
	
	 page.m1();
    }
}
 