package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;

import basicpackage.BaseTest;

public class ClickUsingJavaScriptExecutor {

	private static final String JavaScriptExecutor = null;

	public static void main(String[] args) throws InterruptedException
	{
		// Application 3: 
		
		WebDriver driver = BaseTest.LaunchBrowser("https://www.spotify.com/in-en/signup");
		
		//driver.findElement(By.xpath("//*[@id='confirm']")).sendKeys("@velocitypune.com");
		// this is  a normal way to click 
		 
		driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
		 WebElement maleradio = driver.findElement(By.xpath("//*[@id='gender_option_male']"));
	      
	     JavascriptExecutor js = (JavascriptExecutor)driver;   // click on radio button byusing Javascript 
	    // js.executeScript("arguments[0].value='velocity@pune.com'", maleradio);
          js.executeScript("arguments[0].click();", maleradio);

	}

}
