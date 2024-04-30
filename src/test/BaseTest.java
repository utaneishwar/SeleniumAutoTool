package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pagess.AddToCart;
import pagess.Beers;
import pagess.Search;
import pagess.Spirit;

//BaseTestClass: use for only launching
     public class BaseTest
   {  static WebDriver driver;
	  Search search;
	  Spirit spirit; 
     AddToCart addtocart;
     Beers beer;
     
	 @BeforeSuite
     public void initBrowser()
   {
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\intel\\.cache\\selenium\\chromedriver\\win64\\116.0.5845.96\\chromedriver.exe");
		 ChromeOptions cop =new ChromeOptions();
		 cop.setBinary("C:\\Users\\intel\\.cache\\selenium\\chrome\\chrome.exe");

	 driver =new ChromeDriver(cop);
	 driver.manage().window().maximize();
	 driver.get("https://livingliquidz.com/");
   }
	 
    @BeforeClass               // constructor
   public void createObject()
    {
	 search = new Search(driver);
	 spirit = new Spirit(driver);
	 addtocart=new AddToCart(driver);
	 beer=new Beers(driver);
    }

     @AfterSuite
   public void tearDown()
   {

	driver.close();
	}

}
