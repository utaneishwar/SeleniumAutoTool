package practiceselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffsetScrollingoperation {

	public static void main(String[] args) 
	{
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions act =new Actions(driver);
		act.scrollByAmount(200, 300).contextClick().build().perform();
		
	}

}
