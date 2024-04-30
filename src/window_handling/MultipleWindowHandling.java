package window_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basicpackage.BaseTest;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = BaseTest.LaunchBrowser("https://www.facebook.com/signup");
		// css selector  a#non-users-notice-link
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();

		Set<String> idOfChildWindow = driver.getWindowHandles();

		// 4
		String[] array = new String[idOfChildWindow.size()];
		int i=0;
		for(String childWindow:idOfChildWindow)
		{
			System.out.println(childWindow);

			array[i] =childWindow;
			if(i==2)
			{
				System.out.println(i+"----------------");
				driver.switchTo().window(array[i]);  // 
				// 2
				System.out.println(array[i]);        //2E7A00B8E488DC9D4C45C13A85E89980 
			}
			i++;
		}
		Thread.sleep(4000);
		WebElement searchbar = driver.findElement(By.xpath("//*[@class='x1i10hfl xggy1nq x1s07b3s x1kdt53j x1yc453h xhb22t3 xb5gni xcj1dhv x2s2ed0 xq33zhf xjyslct xjbqb8w xnwf7zb x40j3uw x1s7lred x15gyhx8 x972fbf xcfux6l x1qhh985 xm0m39n x9f619 xzsf02u xdl72j9 x1iyjqo2 xs83m0k xjb2p0i x6prxxf xeuugli x1a2a7pz x1n2onr6 x15h3p50 xm7lytj xsyo7zv xdvlbce x16hj40l xc9qbxq xo6swyp x1ad04t7 x1glnyev x1ix68h3 x19gujb8']"));
		//System.out.println(searchbar.getAttribute("fill-rule"));   //nonzero

		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", searchbar);
		searchbar.sendKeys("www.google.com");
		Actions act =new Actions (driver);
		act.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();


	}

}
