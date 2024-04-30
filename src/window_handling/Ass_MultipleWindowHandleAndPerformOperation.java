package window_handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basicpackage.BaseTest;

public class Ass_MultipleWindowHandleAndPerformOperation {

	public static void main(String[] args)
	{
		// MIMP
		//  Assignment for  Multiple Window Handle and perform operation on perticular window
		
	WebDriver driver = BaseTest.LaunchBrowser("https://www.facebook.com/signup");
		
	
	
	 driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
	 driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click(); 
	 driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click(); 
	 
	 
	 Set<String> allwindow = driver.getWindowHandles();
	
	        int numberofwindow = allwindow.size();       //define size of windowid by using this 
	        System.out.println(numberofwindow);             // will get count of windowsid  like 4
	   
	    String [] winarray =new String [numberofwindow];  // this is blank String array of another type 
	   
	        int i=0;
	  
	           for(String winid:allwindow) 
	           {
               winarray[i]= winid;             // store all winid in the form String array(element) like1,2,3,
                   i++;                      // for iteration 
               }  
	          System.out.println(winarray[0]);
              System.out.println(winarray[1]);
	          System.out.println(winarray[2]);  // will get one bye one all id of the child window
	          
	        driver.switchTo().window(winarray[2]);  // we can perform operation on this window
	       driver.get("https://www.google.com"); 
	         

	}

}
