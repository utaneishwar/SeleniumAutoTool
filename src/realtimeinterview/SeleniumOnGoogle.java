package realtimeinterview;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumOnGoogle {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Selenium");
		List<WebElement> webelement = driver.findElements(By.xpath("//*[@class='UUbT9']"));
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElements(webelement));
		
		WebElement value = null;
		for(WebElement Elementvalue:webelement)
		{
			String textvalue = Elementvalue.getText();
			System.out.println(textvalue);
			if(textvalue.contains("selenium testing"))
			{
				value=Elementvalue;
			}
		}
		value.click();
	}


}



