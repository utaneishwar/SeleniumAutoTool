package window_handling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetWindowHandles 
{
	WebDriver driver=new ChromeDriver();; 
	
	WebDriverWait wait ;
	
	 public void fbsignup()
	{ 
		 driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/signup");
		
	  driver.findElement(By.xpath("//*[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("ishwar");
	  
	 
	  driver.findElement(By.xpath("//*[@id='u_0_d_xy']")).sendKeys("utane");		
	  driver.findElement(By.xpath("//*[@id='u_0_g_sp']")).sendKeys("8975780260");
		 ;
	}
	public void SelectDropDown()
	{  
	WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		Select sel = new Select(day);
		sel.selectByVisibleText("14");
	WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
	sel.selectByValue("5");
	WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
	sel.deselectByIndex(10);
	}
	public void WindowHandle()
	{
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		  String parentid = driver.getWindowHandle();
		  
		driver.findElement(By.xpath
   ("//*[@class='xhb22t3 xb5gni xcj1dhv x6s0dn4 x78zum5 xuxw1ft x47corl x1sln4lm']")).sendKeys("google.com");
	      Set<String> childWid = driver.getWindowHandles();
	      for(int i=1; i<=childWid.size(); i++)
	      {
	    	  Set<String> cid = childWid;
	    	  System.out.println(cid);
	      }
	 
	
	}

	public static void main(String[] args) 
	{
		
		GetWindowHandles  gwh= new GetWindowHandles ();
	//	gwh.fbsignup();
		//gwh. SelectDropDown();
		gwh. WindowHandle();
		
	}

}
