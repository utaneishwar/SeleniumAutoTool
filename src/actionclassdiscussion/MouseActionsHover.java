package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsHover {

	public static void main(String[] args)
	{// hover operation by using mouse action 
		// Following  link will be open and hover on line no 18 and then will get mouse action by using actions class
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions cop = new ChromeOptions();
		cop.setBinary("C:\\Users\\intel\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");

		
		WebDriver driver = new ChromeDriver(cop);
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		WebElement hoverelement = driver.findElement(By.xpath("//*[@id='sub-menu']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(hoverelement).perform();
		
		driver.findElement(By.xpath("//*[@id='link2']")).click();
		
		
		
	}

}
