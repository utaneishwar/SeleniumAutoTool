package popup_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicpackage.BaseTest;

public class PopUpHandlingForPracticepurpose 
{

	public static void main(String[] args) throws InterruptedException
	{
		// Pop up handling there are two types
		// alert popup  : it can be handle by- driver.alert(0.accept();
		// and child browser pop up   : it can be handle by normal way 

    WebDriver driver = BaseTest.LaunchBrowser("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
     driver.findElement(By.xpath("//*[@id='searchBtn']")).click();
     Thread.sleep(1000);
     driver.switchTo().alert().accept();
     Thread.sleep(2000);
     
     //ChildBrowser Popup
        
     WebDriver driver1 = BaseTest.LaunchBrowser("https://www.groww.in");
	driver1.findElement(By.xpath("(//*[@class='absolute-center btn51ParentDimension'])[1]")).click();
		
	driver1.findElement(By.xpath("//*[@class='rodal-close']")).click();
	}

}
