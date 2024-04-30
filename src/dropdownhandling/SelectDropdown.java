package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import basicpackage.BaseTest;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException
	{
		// DROPDOWN:
		// there are two types 
		//1)Select Dropdown: A name which tagName starts with SELECT
		//2)Boot Strap Dropdown: A name  Which tagname does not starts With SELECT.
		
	                                   
	//1)method  : selectByVisibleText: To select the value from select dropdown 
		WebDriver driver = BaseTest.LaunchBrowser("https://www.facebook.com/signup");
	 
		WebElement daydropdown = driver.findElement(By.xpath("//*[@title='Day']"));
		Select selday =new Select (daydropdown);
	
		selday.selectByVisibleText("5");          // by using this method we locate the dropdown
		
	
 // 2)method: selectByValue: To select the value from select dropdown
		    WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		    Select selmonth=new Select(month);
		
	        selmonth.selectByValue("5");          // by using this method 
		
	
 //3) method: selectByIndex: To select the Value from select dropdown WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
              Select selyear=new Select(year);
              selyear.selectByIndex(5);
		           
			
		
	
}
}


