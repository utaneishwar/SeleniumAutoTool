package test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import pagess1.SimpleHomePage;
import pagess1.SpiritPageClass;

public class BaseTest1 
{
	static WebDriver driver;
    static WebDriver driver1;
   
    SimpleHomePage homepage;
	SpiritPageClass spirit;
	 // webelement
	 @BeforeTest
	 public void initBrowser()
	 {
		 
	  driver1=new FirefoxDriver();
	 driver1.manage().window().maximize();
	  driver1.get("https://www.globalsqa.com//samplepagetest");
	  
	  driver = new ChromeDriver();
	  driver.get("https://livingliquidz.com/");
	 
	 }
  
	 @BeforeClass
    public void createobject()
    {
		 
	homepage = new SimpleHomePage(driver1);
	 spirit  = new SpiritPageClass(driver);
    }
   
   @AfterSuite
    public void tearDown() 
    {
	   driver1.close();
	   driver.close();
    }
   }
