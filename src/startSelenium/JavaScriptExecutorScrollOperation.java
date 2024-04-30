package startSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicpackage.BaseTest;

public class JavaScriptExecutorScrollOperation {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=BaseTest.LaunchBrowser("https://jqueryui.com/datepicker/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		//js.executeScript("window.ScrollBy(0,200)");

		WebElement slider = driver.findElement(By.xpath("//*[text()='Slider']"));   
		Thread.sleep(2000);
		js.executeScript("arguments[0].ScrollIntoview();",slider);

}

}
