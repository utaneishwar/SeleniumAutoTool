package navigationbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssGoogleSeleniumSuggestion {

	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	
	List<WebElement> elements = driver.findElements(By.xpath("//*[@type='text']"));
	int noofelements= elements.size();
	for(int i =0; i<noofelements; i++)
	{
		WebElement element = elements.get(i);
		String selenium = element.getText();
		System.out.println(selenium);
	}
	
	

	}

}
