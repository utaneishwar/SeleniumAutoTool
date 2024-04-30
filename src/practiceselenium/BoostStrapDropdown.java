package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoostStrapDropdown {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/recharge");
		driver.findElement(By.xpath("(//*[@type='text'])[1]")).click();
		List<WebElement> allvalues = driver.findElements(By.xpath("//*[@class='_3xI1']//*[span]"));

		WebElement val=null;
		for( WebElement values:allvalues)
		{
			String textvalue = values.getText();

			System.out.println(textvalue);
            if(textvalue.equals("Jio"))
			{
				val= values;
			}
		}

		String value = val.getText();
		System.out.println(value);
		val.click();
	}
}
