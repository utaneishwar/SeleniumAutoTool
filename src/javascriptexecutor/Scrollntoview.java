package javascriptexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicpackage.BaseTest;

public class Scrollntoview {

	public static void main(String[] args) {
		WebDriver driver=BaseTest.LaunchBrowser("https://jqueryui.com/datepicker/");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		WebElement vieweffect = driver.findElement(By.xpath("//*[text()='Effect']"));
		js.executeScript("arguments[0].scrollIntoView();", vieweffect);
	}

}
