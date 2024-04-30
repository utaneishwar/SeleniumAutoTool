package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class AssgnmentSliderHandling extends BaseTest
{

	public static void main(String[] args) 
	{
		//
        BaseTest.LaunchBrowser(" https://jqueryui.com/droppable");
   
     WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
      
       driver.switchTo().frame(iframe);
         
         
    WebElement dragmeto = driver.findElement(By.xpath("//*[@id='draggable']"));
        
        
        Actions act = new Actions(driver);
        act.clickAndHold(dragmeto).moveByOffset(160, 0).release().build().perform();
      
       driver.switchTo().parentFrame();   //we can go on another element by using this method
      driver.findElement(By.xpath("//*[text()='Datepicker']")).click();
  
	}

}
