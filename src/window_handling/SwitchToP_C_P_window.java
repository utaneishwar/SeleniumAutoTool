package window_handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicpackage.BaseTest;

public class SwitchToP_C_P_window
{
	public static void main(String[] args)
	{

		// here we discussed on same class handling 2 windows but 
		//how to switch parent to child and again parent window if we have perform operation on parent window. 

		WebDriver driver = BaseTest.LaunchBrowser("https://www.facebook.com/signup");
		String parentid = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();

		Set<String> allwindowid = driver.getWindowHandles();
		for(String allwin:allwindowid)
		{
			if(!(parentid.equals(allwindowid)))
			{
				System.out.println(allwindowid);
				driver.switchTo().window(allwin);  // switch to child 


			}

		}
		driver.findElement(By.xpath("//*[@type='search']")).sendKeys(" Test Text");
		driver.switchTo().window(parentid);   // switch from child window to parent 
		//perform operation on parentwindow page

		WebElement d = driver.findElement(By.xpath("//*[@name='reg_email__']"));

		d.sendKeys("8788584611");
		driver.findElement(By.linkText("Sign Up")).click();

	}	

}
