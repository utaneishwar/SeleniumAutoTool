package locator;

import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitleAndUrlOfPage {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		
	    String title  =driver.getTitle();
	    System.out.println(title);
	    
	    
	    String urlofpage=driver.getCurrentUrl();
	    System.out.println(urlofpage);

	}

}
