package testngdiscussion;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActualAnnotations 

{  // all annnotation Cover inside class From Suit to Test case
	@BeforeSuite
	public void initbrowser()
	{
		System.out.println("opening the Browser");
	}

	@AfterSuite
	public void tearDown()
	{
		System.out.println("Quit the browser");
	}

	@BeforeTest
	public void naveToElectronics ()
	{
		System.out.println("navigating to electronics module");
	}

	@AfterTest
	public void naveBackToHome ()
	{
		System.out.println("navigating to home page ");
	}
	@BeforeClass
	public void navigateToMobile()
	{
		System.out.println("navigating to Mobile");
	}
	@AfterTest
	public void naveBackToElectronics()
	{
		System.out.println("navigating back to  electronics");
	}
	@BeforeMethod
	public void NavToProductPage()
	{
		System.out.println("navigating to product page");
	}
	@AfterMethod
	public void NavToBackListpage()
	{
		System.out.println("navigating to Back to list of product page");
	}
	
	@Test
	public void AddToCart()
	{
		System.out.println("add to cart test case ");
	}
	
	
	
	
	
	
}
