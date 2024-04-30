package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtraValuefromBootStrap {

	public static void main(String[] args) 
	{// Will get in operator all elementvalue like airtel,jio,bsnl 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/recharge");
		
		
	driver.findElement(By.xpath("//*[@tabindex='1']//*[@type='text']")).click();
	
		
	List<WebElement> allvalue = driver.findElements(By.xpath("//div[@class='_3xI1']//span"));// match 1 of 5
		
      int countvalues = allvalue.size();
      for(int i=0; i<countvalues; i++)
      {
    	         String text = allvalue.get(i).getText();
    	          System.out.println(text);
    	  
      }
    }

}
        ////output will be
            //Airtel
                //BSNL
                   //Jio
                        //MTNL
                             //Vi