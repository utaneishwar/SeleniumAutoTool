package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssForAirtelBootStrapDropdown {

	public static void main(String[] args) 
	{
	//	DROPDROWN
	// There are two types :1)select dropdown     2)Bootstrap Dropdown
		// Wap to boot strap dropdown for Airtel operator
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/recharge");
		
		driver.findElement(By.xpath("//*[@tabindex='1']//*[@type='text']")).click();
		driver.findElement(By.xpath("//div[@class='_3xI1']//*[text()= 'Airtel']")).click();
		

	}

}
