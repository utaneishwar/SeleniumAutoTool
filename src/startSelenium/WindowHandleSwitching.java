package startSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basicpackage.BaseTest;

public class WindowHandleSwitching {

	public static void main(String[] args)
	{

		WebDriver driver =BaseTest.LaunchBrowser("https://www.facebook.com/signup");

		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();

		
		Set<String> childid = driver.getWindowHandles();
		int no = childid.size();
		System.out.println(childid);
		
		String []winArray=new String [no];
		int i=0;
		for(String winid:childid) 
		{   
			
			winArray[i]=winid;
			i++;
		}
		driver.switchTo().window(winArray[3]); 
		System.out.println(winArray[0]); // will get parent id 
		
		driver.quit();



	}

}
