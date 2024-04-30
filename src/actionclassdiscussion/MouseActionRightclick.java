package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class MouseActionRightclick extends BaseTest
{

	public static void main(String[] args) 
	{
		// This is for Mouse action right click .//launch browser from BaseTest class
		BaseTest.LaunchBrowser("https://www.amazon.in/");
	
WebElement hoversignaccount = driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']"));
		
		
		// To perform mouse action inside Action class 
		
		    Actions act = new Actions(driver);
    	   act.moveToElement(hoversignaccount).perform(); 
			
WebElement signbutton = driver.findElement(By.xpath("//*[@class='nav-action-inner']"));
    	   signbutton   .click();
			
    				
 WebElement username = driver.findElement(By.xpath("//*[@id='ap_email']"));
    	    username.sendKeys("utaneishwar@gmail.com");
    				
 // act.contextClick().perform();  // click on regarding still 
		
	 act.click(username).perform();   // will be click on username by using mouse action 
	}

}
