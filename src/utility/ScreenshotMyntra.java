package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import basicpackage.BaseTest;

public class ScreenshotMyntra {

	public static void main(String[] args) throws IOException 
	{
		// To take a screenshot for Myntra || ://www.myntra.com/shop/men
		
		
		WebDriver driver = BaseTest.LaunchBrowser("https://www.myntra.com/shop/");
	  
		
		WebElement a = driver.findElement(By.linkText("MEN"));
		
		
		
		Actions act = new Actions(driver);
	     act.moveToElement(a).perform();
		
                TakesScreenshot b = (TakesScreenshot)driver;
                   File x = b.getScreenshotAs(OutputType.FILE);
	
	     String path =System.getProperty("user.dir")+"//ScreenShots//Myntra.jpg";
	     
	     File f = new File(path);
	    FileHandler.copy(x, f);
	
	
	
	
	}

}
