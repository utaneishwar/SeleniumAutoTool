package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;

import basicpackage.BaseTest;

public class SendkeysUsingJavaScriptExecutor {



	public static void main(String[] args) 
	{
		//SendKeys using javascriptExecutor: 
		//We can perform sendkeys operation using javascriptexecutor in that 
		//we have to just write the text
		
		WebDriver driver = BaseTest.LaunchBrowser("https://www.spotify.com/in-en/signup");
	    JavascriptExecutor js = (JavascriptExecutor)driver;
        
	  WebElement email = driver.findElement(By.xpath("//*[@id='confirm']"));
	   
	   js.executeScript("arguments[0].value='velocity@pune.com'",email);  //we will get print on confirm mail texbox"velocity@pune.com"
	   
	   
	}

}
