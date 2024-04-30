package basicpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) 
	{

		WebDriver driver = BaseTest.LaunchBrowser("https://www.facebook.com/signup");	

		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));

		Select s = new Select(day);
		s.selectByVisibleText("");




	}

}
