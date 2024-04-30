package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicpackage.BaseTest;

public class JavaScriptExecutorForPractice 
{

	public static void main(String[] args) throws InterruptedException 
	{//JavaScriptExecutor is an Interface in wich executeScript() is method 
		//with the help of this method Execute the Script from JavaScript
		
		WebDriver driver = BaseTest.LaunchBrowser("https://jqueryui.com/Datepicker");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		//js.executeScript("window.ScrollBy(0,500)");
		
		Thread.sleep(2000);
		
		WebElement scrollelement = driver.findElement(By.xpath("//*[text()='Effect']"));
	     
		  js.executeScript("arguments[0].scrollIntoView();",scrollelement);
	    
	}

}
