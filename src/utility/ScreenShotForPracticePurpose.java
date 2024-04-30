package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import basicpackage.BaseTest;

public class ScreenShotForPracticePurpose
{
	// how to take a screenshot ion selenium 
	//INFO: we can captured screenshot in selenium using Takescreenshot interface 
	//with the help of  getScreenshotAs (output.File) method .


	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = BaseTest.LaunchBrowser("https://www.google.com");
                    TakesScreenshot ts = (TakesScreenshot)driver;
                  File Source = ts.getScreenshotAs(OutputType.FILE);
                  String path = System.getProperty("user.dir")+"//ScreenShots//google.jpg";
	   	File File = new File(path);
		FileHandler.copy(Source, File);
		
		
		
	}

}
