package realtimeinterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basicpackage.BaseTest;

public class AgainWebTable {

	public static void main(String[] args)
	{
		WebDriver driver= BaseTest.LaunchBrowser("https://demo.guru99.com/test/web-table-element.php");
		//driver.get("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='dataTable']"));


		int i=0;
		for(WebElement element:elements)
		{
			String text = element.getText();
			System.out.println(text);
			if(i==5)
			{
				System.out.println(" ");
				i=1;
			}
			else
			{
				i++;
			}
		}

	}

}
