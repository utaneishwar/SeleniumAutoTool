package testngdiscussion;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DOMClass5 extends DOMClass6
{
	
	@Test  (priority =3)
	public void m3()
	{
	driver.findElement(By.xpath("//*[@id='g2599-email']")).sendKeys("utaneishwar@gmail.com");
	
	}

	
	@Test(priority =4, dependsOnMethods = {"m3"})
	public void m4()
	{
	driver.findElement(By.xpath("//*[@id='g2599-website']")).sendKeys("www.amazon.in");
	}

}    
 //   ===============================================
//     	Suite
//		Total tests run: 4, Passes: 0, Failures: 2, Skips: 2
//		===============================================
