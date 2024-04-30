package Mock;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;


import basicpackage.BaseTest;

public class LumaProject
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = BaseTest.LaunchBrowser("https://magento.softwaretestingboard.com");
		WebElement Women = driver.findElement(By.xpath("(//*[@href='https://magento.softwaretestingboard.com/women.html'])[1]"));
		Thread.sleep(2000);
		WebElement top=driver.findElement(By.xpath("//*[@id='ui-id-9']"));
		WebElement jacket=driver.findElement(By.xpath("//*[@id='ui-id-11']"));
		
		Actions act =new Actions(driver);
		act.moveToElement(Women).build().perform();
		Thread.sleep(1000);
		act.moveToElement(top).build().perform();
		act.moveToElement(jacket).click().build().perform();
		
		WebElement select_Jacket=driver.findElement(By.xpath("(//*[@class='product-image-container'])[1]"));
		select_Jacket.click();

		WebElement Jacket_size=driver.findElement(By.xpath("//*[@id='option-label-size-143-item-167']"));
		Jacket_size.click();

		WebElement Jacket_color=driver.findElement(By.xpath("//*[@id='option-label-color-93-item-57']"));
		Jacket_color.click();

		WebElement Jacket_quantity=driver.findElement(By.xpath("//*[@id='qty']"));
		Jacket_quantity.clear();
		Jacket_quantity.sendKeys("2");

		WebElement Add_to_cart=driver.findElement(By.xpath("//*[@id='product-addtocart-button']"));
		Add_to_cart.click();

		WebElement cart_icon=driver.findElement(By.xpath("//*[@class='counter-number']"));
		act.scrollToElement(cart_icon).build().perform();
		Thread.sleep(2000);
		cart_icon.click();
//		
//		try 
//		{
//			cart_icon.click();
//		} catch (ElementNotInteractableException e) 
//		{
//			
//			System.out.println("click successfully");
//		}
		

		Thread.sleep(2000);
		WebElement delete_product=driver.findElement(By.xpath("//*[text()='Remove']"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", delete_product);
		WebElement ok=driver.findElement(By.xpath("//*[text()='OK']"));
		Thread.sleep(2000);
		ok.click();
		System.out.println("program Script run successfully");
		
	}



}
