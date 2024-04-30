package startSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import basicpackage.BaseTest;

public class FacebookSignup {

	public static void main(String[] args) 
	{

		WebDriver url = BaseTest.LaunchBrowser("https://www.facebook.com/signup");
		url.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Aditya");
		url.findElement(By.xpath("//*[@name='lastname']")).sendKeys("pandey");
		url.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("8780264270");
		url.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("Pass23");

		String titleofpage = url.getTitle();
		System.out.println(titleofpage);  // Sign up for Facebook | Facebook
		String title = "Sign up for Facebook | Facebook";
		Assert.assertEquals(titleofpage,title);

		WebElement day = url.findElement(By.xpath("//*[@id='day']"));
		Select sel =new Select(day);
		sel.selectByVisibleText("19");

		WebElement month = url.findElement(By.xpath("//*[@id='month']"));
		Select selmonth =new Select(month);
		selmonth.selectByIndex(9);

		WebElement year = url.findElement(By.xpath("//*[@id='year']"));
		Select selyear =new Select(month);
		selyear.selectByIndex(1);

		url.findElement(By.xpath("(//*[@class='_58mt'])[2]")).click();
		url.findElement(By.xpath("(//*[@type='submit'])[1]")).click(); 

	}

}
