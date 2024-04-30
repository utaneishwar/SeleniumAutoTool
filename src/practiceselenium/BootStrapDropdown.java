package practiceselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdown
{
	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/recharge");
		driver.findElement(By.xpath("//*[@tabindex='1']")).click();
		List<WebElement> allvalues = driver.findElements(By.xpath("//div[@class='_3xI1']//span"));

		WebElement v=null;
		for(int i=0; i<allvalues.size(); i++)
		{
			String value = allvalues.get(i).getText();
            if(value.equals("Jio"))
			{
				v = allvalues.get(i);
            }
            System.out.println(value);


		}
		    v.click();
	}
}
