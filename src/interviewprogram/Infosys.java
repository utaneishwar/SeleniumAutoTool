package interviewprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicpackage.BaseTest;

public class Infosys {

	public static void main(String[] args)
	{
		WebDriver driver = BaseTest.LaunchBrowser("https://cosmocode.io/automation-practice-webtable/#google_vignette");
		List<WebElement> tot_elem = driver.findElements(By.xpath("//*[@id='post-2338']//tr//td"));

		for(int i=0; i<tot_elem.size(); i++)
		{
			if(tot_elem.get(i).getText().contentEquals("Algeria"))
			{
				System.out.println("country : "+tot_elem.get(i).getText());
				System.out.println("capital : "+tot_elem.get(i+1).getText());
			}
			else
			{
				continue;
			}
		}





	}

}
