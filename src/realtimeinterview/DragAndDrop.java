package realtimeinterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) 
	{
		
//		ChromeOptions option = new ChromeOptions();
//		option.setBrowserVersion("116");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		WebElement trash3 = driver.findElement(By.xpath("(//*[@class='ui-widget-header'])[3]"));

		WebElement bin = driver.findElement(By.xpath("//*[@id='trash']"));
		
		Actions act =new Actions(driver);
		act.dragAndDrop(trash3, bin).perform();
	}

}
