package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class DragAndDrop 
{

	public static void main(String[] args)
	{ //ASSIGNMENT DRAG AND DROP 
	 
		WebDriver driver=BaseTest.LaunchBrowser("https://jqueryui.com/droppable");
	  WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	  driver.switchTo().frame(iframe);
	 
	 
	 WebElement draggable = driver.findElement(By.xpath("//*[@id='draggable']"));
    WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));
    
        Actions act=new Actions(driver);
        act.dragAndDrop(draggable, droppable).perform();
        
        driver.switchTo().parentFrame();
        
        driver.findElement(By.xpath("//*[text()='Datepicker']")).click();
       
    
	}

}
