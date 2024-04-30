package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocator {

	public static void main(String[] args) 
	{
		//2)  class-Locator

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();

	
		
		WebElement registerbutton = driver.findElement(By.className("btn-1"));

		registerbutton.click();

		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("ishwar");


		WebElement lastname = driver.findElement(By.id("lastName"));

		lastname.sendKeys("utane");


		WebElement email = driver.findElement(By.id("userEmail"));

		email.sendKeys("utaneishwar@gmail.com");

		WebElement phonenumber = driver.findElement(By.id("userEmail"));

		phonenumber.sendKeys("8788584611");






	}}
