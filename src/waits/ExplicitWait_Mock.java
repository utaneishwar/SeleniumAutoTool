package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import basicpackage.BaseTest;

public class ExplicitWait_Mock 
{
	
	WebDriver driver;
	WebDriverWait wait;

	@Test(priority=0)
	public void open_site()
	{
		driver=BaseTest.LaunchBrowser("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

	}
	@Test (priority=1)
	public void clickMe_alertr()
	{
		WebElement clickme = driver.findElement(By.xpath("//*[@id='alert']"));
		clickme.click();
		wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}
	@Test(priority=2)
	public void Change_Text()
	{
		WebElement change_text = driver.findElement(By.xpath("//*[@id='populate-text']"));
		change_text.click();

		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[text()='Selenium Webdriver']"), "Selenium Webdriver"));
		WebElement selenium_webdriver = driver.findElement(By.xpath("//*[text()='Selenium Webdriver']"));
		Assert.assertEquals(selenium_webdriver .getText(), "Selenium Webdriver");
	}

	@Test(priority=3)
	public void Display_button()
	{
		WebElement invisible_button = driver.findElement(By.xpath("//*[@id='display-other-button']"));
		invisible_button.click();
		WebElement Hidden_enabled = driver.findElement(By.xpath("//*[@id='hidden']"));
		boolean enable_Display = Hidden_enabled.isDisplayed();
		System.out.println("Before Click :"+enable_Display);           //false

		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='hidden']")));
		wait.until(ExpectedConditions.visibilityOf(Hidden_enabled));
		enable_Display =Hidden_enabled.isDisplayed();
		System.out.println("After Click :"+enable_Display);  //true

	}
	@Test(priority=4)
	public void Enable_button()
	{

		WebElement button = driver.findElement(By.xpath("//*[@id='enable-button']"));
		button.click();
		WebElement button1 = driver.findElement(By.xpath("//*[@id='enable-butto']"));  // fail 
		WebElement button_isdisable = driver.findElement(By.xpath("//*[@id='disable']"));
		boolean isenable_button = button_isdisable.isEnabled();
		System.out.println("Before Click :"+isenable_button);   //false

		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(button_isdisable));

		isenable_button = button_isdisable.isEnabled();
		System.out.println("After Click :"+isenable_button);  //true


	}
	@Test(priority=5, dependsOnMethods="Enable_button")
	public void Check_checkbox()
	{
		WebElement checkbox = driver.findElement(By.xpath("//*[@id='checkbox']"));
		checkbox.click();

		WebElement checkbox_tick= driver.findElement(By.xpath("//*[@id='ch']"));

		boolean selectcheck_box = checkbox_tick.isSelected();
		System.out.println("Before select :"+selectcheck_box );                // false

		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeSelected(checkbox_tick));

		selectcheck_box = checkbox_tick.isSelected();
		System.out.println("After select :"+selectcheck_box );               // true

	}
}
