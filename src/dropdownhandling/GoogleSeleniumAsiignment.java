package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basicpackage.BaseTest;

public class GoogleSeleniumAsiignment {

	public static void main(String[] args)
	{
		//	  WebDriver driver =new ChromeDriver();
		//	  driver.manage().window().maximize();
		//      driver.get("https://www.google.com/");
		
		WebDriver driver= BaseTest.LaunchBrowser("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
		List<WebElement> searchresult = driver.findElements(By.xpath("//*[text()='selenium']"));       

		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(80)); 
		wait.until(ExpectedConditions.visibilityOfAllElements(searchresult));

		WebElement print=null; 
		for(WebElement element:searchresult)
		{
			String TextValue= element.getText();
			System.out.println(TextValue);
			if(TextValue.contains("selenium webdriver"))
			{
				print=element;
				//break;
			}

		} 
		print.click();

	}
}


