package popup_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import basicpackage.BaseTest;

public class Alert_popupHandling {

	public static void main(String[] args) throws InterruptedException
	{
	//   POPUP HANDLING
	//   There are two type 
	//  1)ALERT POPUP: This type of popus come on over the page it wiil not inspect 
		 // but it will freez the any component over the page (means not work if we click on any element)
		// it will handle by using " driver.switchTo().alert().accept(); ": if we want OK  on popup
		                        //" driver.switchTo().alert().dismiss(); ": if we want cancel on  popup
		
		 WebDriver driver = BaseTest.LaunchBrowser("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
		String b = driver.switchTo().alert().getText();   // get text over the alert popup
     
		System.out.println(b);           //   we can also get text
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();     // By using we remove alert popup
		
		
	}

}
