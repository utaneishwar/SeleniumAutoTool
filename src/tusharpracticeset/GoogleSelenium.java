package tusharpracticeset;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSelenium {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("selenium");
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='UUbT9']"));

		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));

		WebElement print = null;
		for(WebElement element:elements)
		{
			String value = element.getText();
			System.out.println(value);

			if(value.contains("selenium testing"))
			{
				print = element;
          
			}

		}

		print.click();



	}

}
