package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class JavaExecuteScriptInterface {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/Datepicker/");
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   //WebElement gmail = driver.findElement(By.xpath("//*[@id='email']"));
		 //  Thread.sleep(2000);
		   js.executeScript("Window.ScrollBy(0,-500)");
		   
		   driver.findElement(By.xpath("//*[text()='Effect']"));
		   
	}

}
