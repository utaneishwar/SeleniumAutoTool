package actionclassdiscussion;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class SliderHandling extends BaseTest
{

	public static void main(String[] args) 
	{   // This program also done by using drag and drop method
		BaseTest.LaunchBrowser("https://jqueryui.com/");

		driver.findElement(By.xpath("//*[text()='Slider']")).click();// we can write also in url add only slider.


		WebElement iframe = driver.findElement(By.xpath("//iframe[@ class='demo-frame']"));
		driver.switchTo().frame(iframe); 

		WebElement slider = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));




		//Actions class operation :perform(); is compalsory.  
		Actions act = new Actions(driver);
	   	 // moveByoffset method support to element 
        act.clickAndHold(slider).moveByOffset(300, 0).release().build().perform();
		driver.switchTo().parentFrame();  // using this method we can cameout from frame 
		// slider moves from start position to right side based on pixel value of x like 300


		// act.clickAndHold(slider).moveByOffset(-200, 0).release().build().perform();     
		// slider moves from start position to left(-) side based on pixel value of x like -200

	}

}
