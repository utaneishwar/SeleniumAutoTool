package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HprtcDropdown {

	public static void main(String[] args) throws InterruptedException
	{
		// HPRTC Dropdown bootstrap Dropdown

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
		driver.findElement(By.xpath("//*[@id='fromPlaceName']")).sendKeys("Shi");
		
		Thread.sleep(3000);
		List<WebElement> allcities = driver.findElements(By.xpath("//*[@id='ui-id-1']//a"));  
		                                                     // while given path should take care of char_  also opther wise not run program normaly
		
	    for (WebElement city:allcities)                      
	    {
		String cityname = city.getText();
		System.out.println(cityname);
	    }
	
// //output will be HOSHIARPUR
//	  KASHIPUR
//	  RISHIKESH
//	  SHAMASHI
//	  SHILAI
//	  SHILAROO
//	  SHILGHAT
//	  SHIMLA ISBT TUTIKANDI
//	  SHIMLA OLD BUS STAND
//	  SHIN NAGAR
//	  SHISHU
//	  SHIV NAGAR
// 
		
	
		
	}

}
