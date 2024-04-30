package realtimeinterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basicpackage.BaseTest;

public class WebTable {

	public static void main(String[] args)
	{
		WebDriver driver = BaseTest.LaunchBrowser("https://demo.guru99.com/test/web-table-element.php");
//		driver.manage().window().maximize();
//		driver.get("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='dataTable']//tr//td"));
		int i = 1;
		for(WebElement element:elements)
		{
		String EleText = element.getText();
		System.out.print(EleText+" ");
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
