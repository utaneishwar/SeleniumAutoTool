package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import basicpackage.BaseTest;

       public class AssMethodForScreenshot
      {   // WAPtocapture the screenshot using method that ask the filename from username
	   
	   
     public static void Screenshot(WebDriver driver, String filename) throws IOException 
        {
	    	 TakesScreenshot tc = (TakesScreenshot)driver;
               File source = tc.getScreenshotAs(OutputType.FILE);

         String path =System.getProperty("user.dir")+"\\Screenshots\\"+filename+".jpg";
     
         File file = new File(path);
         
	     FileHandler.copy(source, file);
	 }

	
	     public static void main(String[] args) throws IOException 
	  {
	  WebDriver driver = BaseTest.LaunchBrowser("https://www.myntra.com/shop/men");
  
          
	//Screenshotmethod from "AssMethodForScreenshot" thisclass
	   AssMethodForScreenshot.Screenshot(driver,"//screenshot//myntra3.jpg");                        // there in logic for Screenshot

		     
	}

}
