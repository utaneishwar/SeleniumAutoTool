package tusharpracticeset;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicpackage.BaseTest;

public class WebTable {

	public static void main(String[] args)
	{
	WebDriver driver = BaseTest.LaunchBrowser("https://demo.guru99.com/test/web-table-element.php");

	
	List<WebElement> element = driver.findElements(By.xpath("//*[@class='dataTable']//tr//td"));
	 
	int i=1;
	for(WebElement ele:element)
	{
		String  text = ele.getText();
		    System.out.print(text+" 		");
		    if(i==5)
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
