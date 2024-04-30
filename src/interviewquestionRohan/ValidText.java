package interviewquestionRohan;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidText {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("how to test responsive");

		Thread.sleep(2000);
		WebElement searchtext = driver.findElement(By.xpath("//*[@id='Zrbbw']"));

		String actual = searchtext.getAttribute("value");

		System.out.println(actual);	



	}

}
