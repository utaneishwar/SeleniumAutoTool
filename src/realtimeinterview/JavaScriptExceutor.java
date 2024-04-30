package realtimeinterview;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import basicpackage.BaseTest;

public class JavaScriptExceutor {

	public static void main(String[] args) 
	{
		WebDriver driver=BaseTest.LaunchBrowser("https://jqueryui.com/datepicker/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 500)");
	}
}
