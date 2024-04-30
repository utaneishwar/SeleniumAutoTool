package practiceselenium;

import java.util.List;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BootStrapDropdownagain {

	public static void main(String[] args) 
	{


		WebDriver driver =new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://paytm.com/recharge");
		driver.findElement(By.xpath("(//*[@type='text'])[1]")).click();
		//  Actions  act =new Actions(driver);

		List<WebElement> alloperator = driver.findElements(By.xpath("//*[@class='_3xI1']//li"));
		WebElement val=null;
		for(WebElement allval:alloperator)
		{
			String value = allval.getText();
			System.out.println(value);
			if(value.equals("Jio"))
			{
				val = allval;
			}

		}
		val.click();
	}
}
