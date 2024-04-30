package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basicpackage.BaseTest;

public class SuggestionSelenium {

	public static void main(String[] args) 
	{
	        WebDriver driver = BaseTest.LaunchBrowser("https://www.google.com/");
	         driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("selenium");
   List<WebElement> selenium = driver.findElements(By.xpath("//*[@class='UUbT9']"));
      
   WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
   wait.until(ExpectedConditions.visibilityOfAllElements(selenium));
   
   
   WebElement print = null;
	   for(WebElement element:selenium)
	   {
		   String value = element.getText();
		   System.out.println(value);
		   if(value.contains("selenium webdriver"))
		   {
			        print = element;
			        break;
		   }
		 }
	                 print.click();
	   }

}
