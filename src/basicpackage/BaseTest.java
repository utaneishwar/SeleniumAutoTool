package basicpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.asm.Advice.Return;

public class BaseTest
{// in this class we made one method in that method we write code for launchbrowser and that can be use 
	//for another class inside another  package 

	public static WebDriver driver;


	public static WebDriver LaunchBrowser(String url)
	{

         // new logic to open browser 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions cop = new ChromeOptions();
	    cop.setBinary("C:\\Users\\intel\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
    
	    driver = new ChromeDriver(cop);
	    driver.manage().window().maximize();
		driver.get(url);

		return driver;
}
























}