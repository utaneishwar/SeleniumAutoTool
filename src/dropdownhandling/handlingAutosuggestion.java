package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingAutosuggestion {

	public static void main(String[] args) throws InterruptedException
	{// on Google search content "selenium" and will get multiple result start from selenium words
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("seleniunm");
		
		Thread.sleep(2000);
		
		List<WebElement> searchresults = driver.findElements(By.xpath("text()='selenium"));
		
		searchresults.size();
		for(int i=0; i<searchresults.size(); i++)
	      {
			String textvalue = searchresults.get(i).getText();
			System.out.println(textvalue);
			
			//note : output will be done.
			
	      }

		
		
		

	}

}
