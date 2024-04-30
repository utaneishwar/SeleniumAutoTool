package tusharpracticeset;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;
import window_handling.SwitchToP_C_P_window;

public class DragAndDrop {

	public static void main(String[] args) 
	{
		WebDriver	driver=BaseTest.LaunchBrowser("https://www.globalsqa.com/demo-site/draganddrop/");

		//		WebElement popup = driver.findElement(By.xpath("//*[@id='menu-item-2804']"));
		//		popup.click();

		//	JavascriptExecutor js = (JavascriptExecutor)driver;
		//	js.executeScript("arguments[0].click();", popup);
		
		
		WebElement frame = driver.findElement(By.xpath("//*[@class='demo-frame lazyloaded']"));
				
		driver.switchTo().frame(frame);
		
	
		WebElement HighTatras = driver.findElement(By.xpath("(//*[@class='ui-widget-header'])[3]"));
		WebElement trash = driver.findElement(By.xpath("//*[@id='trash']"));
		Actions act =new Actions(driver);
      act.dragAndDrop(HighTatras, trash).perform();
		
		
		//		Actions act =new Actions(driver);
//		act.clickAndHold(trash3).moveByOffset(200, 0).release().build().perform();



	}
}