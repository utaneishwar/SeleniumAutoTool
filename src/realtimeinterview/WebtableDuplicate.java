package realtimeinterview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basicpackage.BaseTest;

public class WebtableDuplicate {

	public static void main(String[] args)
	{
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://demo.guru99.com/test/web-table-element.php");
        
		
		WebDriver driver = BaseTest.LaunchBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> allele = driver.findElements(By.xpath("//*[@class='dataTable']"));

		int i=1;
		for(WebElement element:allele)
		{
			String text = element.getText();
			System.out.print(text+" ");   

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
