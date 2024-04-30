package realtimeinterview;

import java.io.File;

import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import basicpackage.BaseTest;
public class CaptureScreenshot {



	public static void main(String[] args) throws IOException
	{

		WebDriver driver =BaseTest.LaunchBrowser("https://www.spicejet.com/");

		TakesScreenshot ts=(TakesScreenshot)driver;  // upcasting 
		File source = ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"\\Screenshots\\spicejet.jpg";
		// String path = System.getProperty("C:\\Users\\intel\\eclipse-workspace\\SeleniumAutoTool\\Screenshots.jpg");
		File file =new File(path);
		FileHandler.copy(source, file);

	}

}
