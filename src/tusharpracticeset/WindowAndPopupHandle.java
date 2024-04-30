package tusharpracticeset;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAndPopupHandle {

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.xpath("//*[@id='newTabBtn']")).click();
		String parentid = driver.getWindowHandle();
		Set<String> childid = driver.getWindowHandles();

		for( String winid:childid)
		{
			if(!(parentid.equals(childid)))
			{
				driver.switchTo().window(winid);
			}
		}
		driver.findElement(By.xpath("//*[@id='confirmBox']")).click();
		
		String textpopup = driver.switchTo().alert().getText();
		System.out.println(textpopup);
		driver.switchTo().alert().accept();
	}
}
