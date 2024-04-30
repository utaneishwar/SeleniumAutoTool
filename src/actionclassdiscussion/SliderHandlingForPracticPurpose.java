package actionclassdiscussion;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class SliderHandlingForPracticPurpose {

	public static void main(String[] args) throws InterruptedException
	{ 
		// concept of i frame And drag the Sliider
		
		WebDriver driver = BaseTest.LaunchBrowser("https://jqueryui.com/slider/");
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
		
		
		
		driver.switchTo().frame(iframe);
	WebElement slider = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
   Actions act = new Actions(driver);
   Thread.sleep(2000);
   act.clickAndHold(slider).moveByOffset(200,0).release().build().perform();
   
   
	 // drag vertically so we will have give value to x pixel
   //if we will have drag horizantally then we will have to valuee y pixel and 
   // if we give negatative value then it will move to leftside means negative side
   //------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
