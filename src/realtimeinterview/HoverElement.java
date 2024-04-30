package realtimeinterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HoverElement {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions cop = new ChromeOptions();
	cop.setBinary("C:\\Users\\intel\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");

		
		WebDriver driver =new ChromeDriver(cop);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement signin = driver.findElement(By.xpath("(//*[@class='nav-icon nav-arrow'])[2]"));
		Actions act =new Actions(driver);
		//act.moveToElement(signin).perform();
		
		// scrolling operation
		
		WebElement dealofday = driver.findElement(By.xpath("(//*[@class='a-list-item'])[4]"));
		act.scrollToElement(dealofday).contextClick().build().perform();
	}

}
