package navigationbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAPagemethods {

	public static void main(String[] args) 
	{
		// Difference method like get(); and  Navigate.to
		// point of view functionallity there no difference 
		// only diff is that called on based on get()    and     navigte().to
		
		
		
		WebDriver driver = new ChromeDriver();
	       driver.manage().window().maximize();
	//       driver.get("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
		driver.navigate().to("https://online.hrtchp.com/oprs-web/guest/home.do?h=1");
		
		
		
		
		
	}

}
