package tusharpracticeset;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RohanLogicForWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");

		String parentid = driver.getWindowHandle();
		System.out.println(parentid);

		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		Set<String> childid = driver.getWindowHandles();
		System.out.println(childid);
		String [] id =new String [childid.size()];
	
		int i = 0;
		for(String winId:childid)
		{
			id[i]=winId;
			
			
			i++;
		}
		System.out.println(id[2]);
		System.out.println(" ******** ");
		System.out.println(id[1]);
		driver.switchTo().window(id[2]);
		String title = driver.getTitle();
         System.out.println(title);
	}}
