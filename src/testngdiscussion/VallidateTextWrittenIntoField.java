package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class VallidateTextWrittenIntoField 
{
	@Test
	public void GetTextFromField()
	{
		//getAttribute();:it is method which is used to get the text from textfield which will have written.
		
		WebDriver driver = BaseTest.LaunchBrowser("https://www.facebook.com/signup");
		
		    WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		         firstname.sendKeys("Test Text");
		    String text = firstname.getAttribute("value");   // "value" we can take value class ,id, name like that 
		    
		    System.out.println(text);   //    Test Text
		    
		    Assert.assertEquals(text, "Test Text");     
		    
		    String attvalue = firstname.getAttribute("class");
		    
		    System.out.println(attvalue);  
		    
 String idvalue = firstname.getAttribute("id");
		    
		    System.out.println(idvalue); 
		    
         
	}
	
//OUTPUT:	
//   Test Text
//	   inputtext _58mg _5dba _2ph-
//	   u_0_b_B7

}
