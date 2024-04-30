package popup_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import window_handling.SwitchToP_C_P_window;

public class PopHandlingPractice
{
	public static void main(String[] args) throws InterruptedException
	{
	    WebDriver driver = new ChromeDriver();
	 driver.get("https://www.globalsqa.com/samplepagetest/");
		driver.findElement(By.xpath("//*[@onclick='myFunction()']")).click();
		Thread.sleep(2000);
		String textFromPop = driver.switchTo().alert().getText();
		System.out.println(textFromPop);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
	}

}
