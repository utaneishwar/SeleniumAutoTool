package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicpackage.BaseTest;

public class BootStrapDropdownHandle {

	public static void main(String[] args) 
	{
		WebDriver driver=BaseTest.LaunchBrowser("https://paytm.com/recharge");
		driver.findElement(By.xpath("(//*[@type='text'])[1]")).click();
		
	  List<WebElement> allvalues = driver.findElements(By.xpath("//*[@class='_3xI1']//li"));

			//  int countvalue = allvalues.size();
			  
	            WebElement	value=null;
			  for(int i =0; i<allvalues.size(); i++)
			  {
				 String text = allvalues.get(i).getText();
				 System.out.println(text);
				 if(text.contains("Airtel"))
				 {
					  value = allvalues.get(i);
				 }
			  }
			  value.click();
	}

}
