package testngdiscussion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class PrintWholeTableLineByline 
{
	
	@Test
	public void getAllvalues()
	{
		WebDriver driver =BaseTest.LaunchBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='dataTable']//tbody//tr"));
		int i=1;
		for( WebElement element:elements)
		{
			String text = element.getText();
			System.out.print(text+" ");
			if(i==5)
			{
				System.out.println("");
				i=1;
			}
			else
			{
				i++;
			}
		}
		
		
	}
}
