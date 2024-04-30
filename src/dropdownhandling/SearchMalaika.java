package dropdownhandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basicpackage.BaseTest;

public class SearchMalaika {

	

	public static void main(String[] args) {
		WebDriver driver= BaseTest.LaunchBrowser("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Malaika");
		List<WebElement> searchresult = driver.findElements(By.xpath("//*[@class='sbai JCHpcb']"));       
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(120));
		wait.until(ExpectedConditions.visibilityOfAllElements(searchresult));
		
		WebElement print = null;
		for(WebElement element:searchresult )
		{
		               String getname = element.getText();
		               System.out.println(getname);
		               if(getname.contains("malaika arora and arjun kapoor"))
		               {
		            	  print=element; 
		            	  break;
		               }
		}
		print.click();
	}

}
