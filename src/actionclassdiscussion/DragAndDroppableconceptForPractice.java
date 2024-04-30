package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class DragAndDroppableconceptForPractice {

	public static void main(String[] args)
	{
		// here we discussed about drag and drop 
		
		WebDriver driver = BaseTest.LaunchBrowser("https://jqueryui.com/droppable/");
		
    WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
      
      driver.switchTo().frame(iframe);
      WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
    
    Actions act = new Actions(driver);
    
    act.clickAndHold(drag).moveByOffset(175, 0).release().build()
    .perform();
    
          driver.switchTo().parentFrame();
      WebElement c = driver.findElement(By.xpath("//*[text()='Accordion']"));
      act.moveToElement(c).click().build().perform();
    
    
	}

}
