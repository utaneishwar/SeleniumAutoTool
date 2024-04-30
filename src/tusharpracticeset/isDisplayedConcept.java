package tusharpracticeset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class isDisplayedConcept {

	public static void main(String[] args)
	{
		// These Are the Webelement interface method isDisplayed, isEnabled ,isSelected

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		// isDisplayed method
		WebElement carticon = driver.findElement(By.xpath("//*[@id='nav-cart-count']"));
		boolean isdisplay = carticon.isDisplayed();
		System.out.println(isdisplay); // true


		WebElement hidden = driver.findElement(By.xpath("//*[@id='glowValidationToken']"));
		boolean hiddenelement = hidden.isDisplayed();
		System.out.println(hiddenelement);   // false because webelement is present over the page but it is hidden so

		//	 isEnabled method 
		WebElement searchbox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		boolean search = searchbox.isEnabled();
		System.out.println(search);   // true it is present and we can perform action on it
	} 
	     //isSelected();
	@Test
	public void isSelected()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com//signup");

		WebElement radiobutton = driver.findElement(By.xpath("//*[@type='radio' and @value='1']"));//here we use for xpath and and or operater

		System.out.println("before selected radiobutton status");
		boolean isselected = radiobutton.isSelected();
		System.out.println(isselected);

		radiobutton.click();
		System.out.println("After selected radiobutton status");
		boolean isselected1 = radiobutton.isSelected();
		System.out.println(isselected1);
	}

}
