package actionclassdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class ScroolingByCoordinate {

	public static void main(String[] args) 
	{
		// Scrolling by cordinate by using ScrollByAmount(x,y)method
		
//
//		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in/");
		
		WebDriver driver= BaseTest.LaunchBrowser("https://www.amazon.in/");
		Actions act = new Actions(driver);
		act.scrollByAmount(0, 200).perform();  // scrolling in co-ordinate manner
		act.contextClick();      // Right click 
	}

}
