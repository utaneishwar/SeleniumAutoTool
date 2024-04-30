package tusharpracticeset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RohanIframeprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop//");
		
	//	driver.findElement(By.xpath("(//*[text()='Drag And Drop'])[3]")).click();
		
		WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(iframe);
		
		WebElement drag = driver.findElement(By.xpath("(//*[@class='ui-widget-header'])[1]"));
		
		WebElement drop = driver.findElement(By.xpath("//*[@id='trash']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).perform();
	}
	}


