package realtimeinterview;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basicpackage.BaseTest;

public class HandleBootStrapDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =BaseTest.LaunchBrowser("https://paytm.com/recharge");

		Thread.sleep(3000);
		WebElement operator = driver.findElement(By.xpath("//*[@class='_1exI']"));
		operator.click();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='_3xI1']//li"));  // 1 of 5
		WebElement web=null;
		String var="";
		for(WebElement value:list)
		{
			var=value.getText();
			System.out.println(var);   // all the element will get in text 
			if(var.contains("BSNL"))
			{
				web=value;

			}
		}
		web.click();

		//------------------------------------------------------------	


		WebElement circle = driver.findElement(By.xpath("(//*[@class='_1exI'])[2]"));
		circle.click();
		//driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		List<WebElement> list1 = driver.findElements(By.xpath("//*[@class='_3xI1']//li"));  // 1 of 20
		System.out.println(list1.size());  // 20
		String var1="";
		WebElement web1=null;
		for(WebElement value1:list1)
		{
			var1=value1.getText();  // all the elemenet in text
			System.out.println(var1);  

			//			WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(60));
			//			wait.until(ExpectedConditions.visibilityOfAllElements(list1));

			//PageFactory.initElements(driver, var1);

			if(var1.contains("Himachal Pradesh"))
			{
				web1=value1;

			}
		}
		web1.click();


	}

}
