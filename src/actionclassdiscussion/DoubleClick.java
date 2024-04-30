package actionclassdiscussion;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class DoubleClick {

	public static void main(String[] args) 
	{
		WebDriver driver=BaseTest.LaunchBrowser("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
     
		WebElement Doubleclick = driver.findElement(By.xpath("//*[@id='double-click']"));
		Actions act =new Actions(driver);
       act.doubleClick(Doubleclick).perform();
		
	}

}
