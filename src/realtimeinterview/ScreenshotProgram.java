package realtimeinterview;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import basicpackage.BaseTest;

public class ScreenshotProgram {

	public static void main(String[] args) throws IOException {
		WebDriver driver = BaseTest.LaunchBrowser("https://www.spicejet.com/");

		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir")+"\\SeleniumAutoTool\\Screenshots.jpg";
      // String path ="C:\\Users\\intel\\eclipse-workspace\\SeleniumAutoTool\\Screenshots.png";
		File file =new File("C:\\Users\\intel\\eclipse-workspace\\SeleniumAutoTool\\Screenshots.png");
		org.openqa.selenium.io.FileHandler.copy(source, file);
	
		
		
   

}}
