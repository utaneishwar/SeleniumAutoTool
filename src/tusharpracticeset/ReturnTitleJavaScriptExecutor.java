package tusharpracticeset;

import org.apache.poi.hslf.record.Document;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReturnTitleJavaScriptExecutor {

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
           String Pagetitle = js.executeScript("return document.title;").toString();
             System.out.println(Pagetitle);
	}

}
