package interviewprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicpackage.BaseTest;

public class InfosysWebtable {

	public static void main(String[] args) 
	{
		WebDriver driver = BaseTest.LaunchBrowser("https://cosmocode.io/automation-practice-webtable/#google_vignette");
		List<WebElement> list = driver.findElements(By.xpath("//*[@id='post-2338']//tr//td"));
		int i=1;
		for(WebElement element:list)
		{
			 String text = element.getText();
			 System.out.print(text+"		");
			 if(i==5)
			 {
				System.out.println(); 
				i=1;
			 }
			 else
			 {
				 i++;
			 }


		}

	}

}
