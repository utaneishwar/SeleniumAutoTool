package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicpackage.BaseTest;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException 
	{
		//Scrolling by js.JavaScriptExecuter
		
		WebDriver driver=BaseTest.LaunchBrowser("https://jqueryui.com/Datepicker");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;   // typecasting 
		
		// Scrolling by pixel value over the page 
		
//		js.executeScript("Window.scroolBy(0,500)");
//		Thread.sleep(2000);
//		js.executeScript("Window.scroolBy(0,-200)");
	
	WebElement scrollelement = driver.findElement(By.xpath("//*[text()='Effect']"));
	
	js.executeScript("arguments[0].scrollIntoView();",scrollelement);
	
	
	
	
	
	
	
	
	
	
	}

}
