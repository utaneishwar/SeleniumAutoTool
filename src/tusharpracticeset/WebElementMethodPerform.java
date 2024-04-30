package tusharpracticeset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebElementMethodPerform 
{
	public static void main(String[] args)
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement cartIcon = driver.findElement(By.xpath("//*[@id='nav-cart-count']"));
		boolean value = cartIcon.isDisplayed();
		System.out.println(value); //true

		WebElement hiddenelement = driver.findElement(By.xpath("//*[@id='glowValidationToken']"));
		boolean hiddene = hiddenelement.isDisplayed();
		System.out.println(hiddene); // false

		// isEnabled
		WebElement search = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		boolean perform = search.isEnabled();
		System.out.println(perform);
	}

	@Test (priority=1,enabled = false)
	public void isSelected()
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement radio = driver.findElement(By.xpath("(//*[@type='radio'])[1]"));
		boolean value = radio.isSelected();
		System.out.println("status before "+ " = "+ value);
		radio.click();
		boolean value2 = radio.isSelected();
		System.out.println("status after "+ " = "+ value2);
	}
	@Test (priority=2)
	public void getAttribute()
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");

		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
		firstname.sendKeys("Rohan");
		String value = firstname.getAttribute("value");
System.out.println(value);
		 Assert.assertEquals(value, "Rohan");



	}
}
