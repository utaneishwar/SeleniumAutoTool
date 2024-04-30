package actionclassdiscussion;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class MouseActionsForPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		// how upload file and to perform mouse actions
		
		WebDriver driver = BaseTest.LaunchBrowser("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.findElement(By.xpath("//*[@type='file']")).sendKeys("C:\\Users\\intel\\Desktop\\SQL");
		
		
		
		WebElement hoverelement = driver.findElement(By.xpath("//*[@id='sub-menu']"));
		Actions act = new Actions (driver);
		act.moveToElement(hoverelement).perform();;
		driver.findElement(By.xpath("//*[@id='link2']")).click();
		
	
		
	}

}
