package navigationbasics;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalSteps {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver ();
		
		// maximize the url
		driver.manage().window().maximize();
		
		// navigate to url
		
		
		driver.get("https://www.amazon.in");

		// navigate to another url
		
		driver.get("https://www.google.com");
		
	// to navigate for Back	
		
		driver.navigate().back();
		
	// to navigate for forword	
		driver.navigate().forward();
		
		// for refresh
		driver.navigate().refresh();
		
		
		// for close the browser
		driver.close();
	}

}
