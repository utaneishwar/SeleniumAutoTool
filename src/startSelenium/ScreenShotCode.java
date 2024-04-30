package startSelenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import basicpackage.BaseTest;

public class ScreenShotCode {

	public static void main(String[] args) throws IOException 
	{

		WebDriver driver =BaseTest.LaunchBrowser("https://www.google.com/");
		TakesScreenshot ts =(TakesScreenshot)driver;

		File  source=ts.getScreenshotAs(OutputType.FILE);
		//String path = System.getProperty("output.dir")+"\\Screenshots.jpg";
		String path ="C:\\Users\\intel\\eclipse-workspace\\SeleniumAutoTool\\Screenshots\\GoogleScreenshot.jpg";
		File file =new File(path);
		FileHandler.copy(source, file);








	}

}
