package tusharpracticeset;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Practice {
	 static int i = 1;

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");

		List<WebElement> datatble = driver.findElements(By.xpath("//*[@class='dataTable']//tbody//tr//td"));
	for(WebElement webelements:datatble)
	{
	    String value = webelements.getText();
	
    	//System.out.print(value);
		System.out.print(value+" ");
		if( i==5)
		{
		  System.out.println();	
		  i=1;
		}
		else
		{
			i++;
		}
	}
	
	}

}
