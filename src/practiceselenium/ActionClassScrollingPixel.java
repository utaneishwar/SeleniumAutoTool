package practiceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassScrollingPixel {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions act =new Actions(driver);
		WebElement scroll = driver .findElement(By.xpath("(//*[@class='_deals-shoveler-v2_style_dealImage__3nlqg'])[4]"));
		act.moveToElement(scroll).click(scroll).build().perform();
	}

}
