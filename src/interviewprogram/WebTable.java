package interviewprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {

	public static void main(String[] args)
	{
        
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		 ChromeOptions cop =new ChromeOptions();
		 cop.setBinary("C:\\Users\\intel\\.cache\\selenium\\chrome\\chrome.exe");
		 
		
		WebDriver driver =new ChromeDriver(cop);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");

		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='dataTable']//td"));
		int i=1;
		for(WebElement element:elements)
		{
			String text=element.getText();
			System.out.print(text+"		");
			
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
