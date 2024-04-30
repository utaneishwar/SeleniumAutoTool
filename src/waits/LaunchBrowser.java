package waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
      
	public static void main(String[] args) 
	{  
		     WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);

	   
	     driver.manage().window().maximize();
	     driver.get("https://reqres.in/");
	

	}

}
