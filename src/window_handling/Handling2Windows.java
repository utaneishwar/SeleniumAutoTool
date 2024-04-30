package window_handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basicpackage.BaseTest;

public class Handling2Windows {

	public static void main(String[] args)
	{
		//Discussion about 2 Windows 
		//THere are TWo types of Windows 
		//1) PARENT WINDOW:  That Window is open at first 
	   // 2) CHILD WOINDOW:   That windows are  open after parent Window (are first window)
//---------------------------------------------------------------
		
		
		
	  WebDriver driver = BaseTest.LaunchBrowser("https://www.facebook.com/signup");

	  String parentid= driver.getWindowHandle();
	
	  // System.out.println("parent id is:"+parentid);   //we will get id of parent window and its a unique
	  
	 driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
	
	 
	 // String parentidwindow1 = driver.getWindowHandle();    // when 2nd time call to parent window it will get same id no changes
    //  System.out.println("parent id window 2 return:"+parentidwindow1);

	  Set<String> allwindowid = driver.getWindowHandles();      // we will get child window id 
	            
	 
	     for(String allwin :allwindowid) 
	     {
	     	System.out.println(allwin);  
	
	     	if(!(parentid.equals(allwin)))
		     {
	     		driver.switchTo().window(allwin);	
		     }
	     }
	       
	 driver.findElement(By.xpath("//*[@type='search']")).sendKeys(" Test Text");
	             
	  //output will get print on search text "  Test Text"
	 // by using "driver.getWindowHandles(); "method 
	             
	}

}
