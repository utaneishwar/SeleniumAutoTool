package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import basicpackage.BaseTest;

public class Screenshot {

	public static void main(String[] args) throws IOException

	{
		//To take Screenshot for facebook page 

		WebDriver driver = BaseTest.LaunchBrowser("https://www.facebook.com/");

		TakesScreenshot ts = (TakesScreenshot)driver;   // type casting
		File source = ts.getScreenshotAs(OutputType.FILE);  //to capture screenshot



		// String path="C:\\Users\\intel\\eclipse-workspace\\SeleniumAutoTool\\Screenshots\\google.jpg";

		String path=System.getProperty("user.dir")+"\\Screenshots\\facebook.jpg";  

		File file= new File(path);
		FileHandler.copy(source,file);


	}

}
