package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import basicpackage.BaseTest;

public class SelectDropdownPractice {

	public static void main(String[] args)
	{
		WebDriver driver=BaseTest.LaunchBrowser("https://www.facebook.com/signup");
		
		 WebElement dayDropdown = driver.findElement(By.xpath("//*[@id='day']"));
		Select selday = new Select(dayDropdown);
		selday.selectByVisibleText("14");
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		Select selmonth=new Select (month);
		selmonth.selectByValue("5");
		
		 WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		Select selyear= new Select(year);
		selyear.selectByIndex(22);
		
		
		
		
		
		
	}

}
