package realtimeinterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import basicpackage.BaseTest;

public class GetAttribute {

	public static void main(String[] args)
	{
		WebDriver driver =BaseTest.LaunchBrowser("https://www.facebook.com/signup");
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/signup");
		
		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		firstname.sendKeys("TestText");
		
		String text = firstname.getAttribute("value");
		System.out.println(text);  //TestText
		// in advance
		String namevalue = firstname.getAttribute("name");
		System.out.println(namevalue); //firstname 
		
		 // note: getAttribute return String value if we provided attribute name inside the argument
		// if we pass value ,name ,class,type
	}

}
