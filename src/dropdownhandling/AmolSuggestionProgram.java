package dropdownhandling;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmolSuggestionProgram 
{
   public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.co.in/");
				
				
 driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
   List<WebElement> suggetions = driver.findElements(By.xpath("//*[text()='selenium']"));
				
				
				WebElement selectElement = null;
				for(WebElement print : suggetions)
				{
				   String value = print.getText();
				   
				   System.out.println(value);
				   
				   if(value.contentEquals("selenium webdriver"))
				   {
					   selectElement = print;
				   }
				   
				}
				
				selectElement.click();
	}
   }


