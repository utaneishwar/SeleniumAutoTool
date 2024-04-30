package realtimeinterview;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		
		
		String parentid = driver.getWindowHandle();
		System.out.println(parentid);
		
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		
		Set<String> childid = driver.getWindowHandles();
		System.out.println(childid);
		
		String[]id =new String[childid.size()];
		
		int i=0;
		for(String idvalue:childid)
		{
			id[i]=idvalue;
			i++;
		}
		System.out.println(id[2]);
		driver.switchTo().window(id[2]);
		String title = driver.getTitle();
		System.out.println(title);
		}

}
