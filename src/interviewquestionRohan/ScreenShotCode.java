package interviewquestionRohan;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import basicpackage.BaseTest;

public class ScreenShotCode {

	public static void main(String[] args) throws IOException 
	{
		// ScreenShotCode
		WebDriver driver = BaseTest.LaunchBrowser("https://github.com/Vimannagar/JanBatchRestAssured");
		TakesScreenshot ts =(TakesScreenshot)driver;
		
		String path= System.getProperty("user.dir")+"\\Screenshots\\mis.jpg";
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		
		File file =new File(path);
		FileHandler.copy(source,file);
				
		

	}

}
