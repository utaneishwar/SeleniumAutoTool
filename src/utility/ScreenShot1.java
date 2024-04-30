package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import basicpackage.BaseTest;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException 
	{
		// Logioc for how to take ScreenShot 
		// it is only applicable for whole page not a particular part and only webbased service apllication
		
		WebDriver driver = BaseTest.LaunchBrowser("http://www.google.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File Source = ts.getScreenshotAs(OutputType.FILE);
		
	String path=System.getProperty("user.dir")+"\\Screenshots\\google.jpg";
	
		File file=new File(path);
		
		FileHandler.copy(Source, file);

		
		
		
	}

}
