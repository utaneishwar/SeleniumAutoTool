package realtimeinterview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import basicpackage.BaseTest;

public class HeadlessMode {



	public static void main(String[] args)
	{
		

		ChromeOptions opt =new ChromeOptions();
		opt.addArguments(" Window-size=1400,271");
		opt.addArguments("--Headless" );
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.google.com/");
	//	BaseTest.LaunchBrowser("https://www.google.com/");





	}

}
