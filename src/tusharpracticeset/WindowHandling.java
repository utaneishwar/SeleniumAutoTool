package tusharpracticeset;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		Set<String> childid = driver.getWindowHandles();
		//System.out.println(childid);
		for(String winId:childid)
		{
			System.out.println(winId);
			if(!(parentid.equals(winId)))
			{
				driver.switchTo().window(winId);
			}
		}
		
		driver.findElement(By.xpath("//*[@type='search']")).sendKeys("Test Text");

	}

}
