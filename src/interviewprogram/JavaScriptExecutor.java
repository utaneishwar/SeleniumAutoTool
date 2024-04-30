package interviewprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScriptExecutor {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions cop = new ChromeOptions();
		cop.setBinary("C:\\Users\\intel\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");

			
			WebDriver driver =new ChromeDriver(cop);
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/datepicker/");
            JavaScriptExecutor js = (JavaScriptExecutor)driver;
           WebElement effect = driver.findElement(By.xpath("//*[text()='Effect']"));
         	js.executeScript("arguments[0].ScrollIntoview();",effect);

	}

	private void executeScript(String string, WebElement effect) {
		// TODO Auto-generated method stub
		
	}



}
