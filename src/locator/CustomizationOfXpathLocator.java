package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import basicpackage.BaseTest;

public class CustomizationOfXpathLocator
{

	public static void main(String[] args)
    {   //MIMP
		// customization of Xpath:
		//1)contains 2)indexing  3) and/ or perator   4) text()
		// there are two types :
		// 1)Absolute xpath: To locate the webelement in which we use only single forward slash/  and which also start with from top to still position of elemnts  
		//2)Relative xPath: To locate the webelement in which we can jump from one node to another by skipping intermediate node 
		
//-==================================================================================-------------------------------------------------------------------------		
//		
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(60));
		WebDriver driver=BaseTest.LaunchBrowser("https:www.facebook.com/signup");
		driver.get("https:www.facebook.com/signup");
		
	//--------------------------------------------
		//1) contains: it is method  which we can use inside xpath 
		               //to locate the value partially if it matches with any of the attribute value
		//syntax:  (//"tagname[contains(@attribute_type,'attribute_value')]");
		
	     WebElement firstname = driver.findElement(By.xpath("//div[contains(@id,'u_0_a_6')]"));
		 firstname.sendKeys("Ishwar");
	  

		 
//	----------------------------------------------------------
	     // 2) indexing :  if we have multiple matches for xpath that we have written 
	               // then we want to locate a single element from that then we can use indexing .but it is last option
	                // because if anything gets changes then it may hamper the execution of script
	  
            
		WebElement mobile = driver.findElement(By.xpath("//input[@type='text'][3]"));
	      mobile.sendKeys("8788584611");
	      
	      
	
	
//-------------------------------------------------
	     // 4)text():it is method inside a xpath which is used to locate the textual elements over the webpage. 
          
	         
	      WebElement text = driver.findElement(By.xpath("//div[text()='create a new account']"));
	
	
   // and /or operator : we can use the this operator between the xpath to compare xpath through boolean operation.
   
   // EXAMPLE:  //syntax[@attributetype='attribute_value']
   // //select[@name='birthday_day' or id='day']  --------------we can use "AND"in place of "OR"
		
		
	}

}
