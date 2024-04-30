package window_handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basicpackage.BaseTest;

public class WindowHandle 
{
    public static void main(String[] args)
    {
		WebDriver driver = BaseTest.LaunchBrowser("https://www.facebook.com/signup");
		String parentid = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		Set<String> allWinid = driver.getWindowHandles();
		    
		int numberofwindow=allWinid.size();
		String winarray []=new String[numberofwindow];
		System.out.println(numberofwindow);
		
		int i=0;
		for(String winid:allWinid)
		{
			winarray [i]=winid;
			i++;
			
		}
		WebDriver id = driver.switchTo().window(winarray[3]);
		
		System.out.println(id);
		
		
		
	}
}
