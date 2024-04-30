package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssSEleniumAfterselectallvalue 
{
    // On google write selenium and will shows multiple result with start of "selenium"
	
	public static void main(String[] args)
	 {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//*[@name='q']")).sendKeys("selenium");
	
	List<WebElement> searchresult = driver.findElements(By.xpath("//*[text()='selenium']"));
	for(int i =0; i<searchresult.size(); i++)
	{
	
		String textvalue = searchresult.get(i).getText();
		System.out.println(textvalue);
		
	}
	
	

	}

}
	
