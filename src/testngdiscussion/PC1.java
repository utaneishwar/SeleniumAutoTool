package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PC1 
{
// we can execute parallel classes like pc1 and pc2 at time same time

	@Test
	public void m1()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void m2()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
// o/p : execute the both classes same time 	
// testngdiscussion.PC1	
//	m1	1682600584146	9543
//	m2	1682600593699	4982
//	testngdiscussion.PC2	
//  m3	1682600584146	13081
//	
	
}
