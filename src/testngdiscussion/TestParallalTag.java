package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import basicpackage.BaseTest;

public class TestParallalTag
{ // we can execute testTag parallaly   write parameter parallel="tests" on suit level inside xml file 
	@Test
	public void SearchFlight() throws InterruptedException
	{
		WebDriver driver = BaseTest.LaunchBrowser("https://www.makemytrip.com/");
		Thread.sleep(3000);
		WebElement searchbutton = driver.findElement(By.xpath("//*[text()='Search']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].click();", searchbutton);
	}
}


//o/p: look at time : 1 test case is passed and 1 is failed
//google — passed
//testngdiscussion.TestTagParallel2	google	        1682654846751	7143
//MMT — failed
//testngdiscussion.TestParallalTag	SearchFlight	1682654846751	13988
//
