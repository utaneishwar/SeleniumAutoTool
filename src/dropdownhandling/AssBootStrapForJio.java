package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssBootStrapForJio {

	public static void main(String[] args) throws InterruptedException 
	{// click jio on operator webelement
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/recharge");
		
		
		driver.findElement(By.xpath("//*[@tabindex='1']//*[@type='text']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@class='_3xI1']//*[text()='Jio']")).click();
	

          Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Pay Loan']")).click();
	}

}
