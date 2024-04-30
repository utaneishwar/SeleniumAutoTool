package navigationbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsVsFindElement 
{

	public static void main(String[] args) 
	{    // findElements:for find multiple element and return list of  webelements.
		// findElement:for find single element and return only single webelement.
		
		//Difference between  findElement vs findElements
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
//	WebElement element = driver.findElement(By.xpath("//*[@id='u_0_b_PX123']"));
	// above will give NoSuchElement exception if any element is not locate due to wrong x.path//like //*[@id='u_0_b_PX123'	
	//like       org.openqa.selenium.NoSuchElementException:
	
	
		List<WebElement> yearelements = driver.findElements(By.xpath("//*[@id='u_0_b_PX123']"));
	
		// above will return empty list (like-0) if any element is not locate due to wrong x.path//like //*[@id='u_0_b_PX123'
	// but not give exception
	
	
		int noofelements =  yearelements.size();
		
		for
		(int i=0; i<noofelements; i++)
     {
			WebElement elements = yearelements.get(i);
			String yearvalue = elements.getText();
			System.out.println(yearvalue);
	
	}

}}
	
