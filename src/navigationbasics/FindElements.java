package navigationbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	private static final int i = 0;

	public static void main(String[] args)
	{ // incomplete program
		// find no of element by using for loop
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		List<WebElement> yearelements = driver.findElements(By.xpath("//*[@id='year']//option"));
	
		int noofelements=yearelements.size();   // it will give size of list webelements
		
		for(int i=0; i<noofelements; i++);  
		{
			WebElement element = yearelements.get(i);
			String yearvalue= element.getText();
			System.out.println(yearvalue);
		}

}
	}
