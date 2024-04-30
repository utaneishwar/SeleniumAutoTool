package interviewprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basicpackage.BaseTest;

public class InfosysProgram 
{
	public static void main(String[] args) 
	{
		WebDriver driver = BaseTest.LaunchBrowser("https://cosmocode.io/automation-practice-webtable/#google_vignette");
		List<WebElement> tot_elem = driver.findElements(By.xpath("//*[@id='post-2338']//tr//td"));
		int count=0;
		for(int i=0; i<tot_elem.size(); i++ )
		{

			String text = tot_elem.get(i).getText();
            System.out.print(text+"	");
			if(text.contentEquals("Algeria"))
			{
				System.out.print("country: "+text+" "); 
				System.out.print("capital: "+tot_elem.get(i+1).getText()); 
			}
			if(count==4)
			{
				System.out.println();
				count=0;
			}
			else
			{
				count++;
			}
		}
	}}



