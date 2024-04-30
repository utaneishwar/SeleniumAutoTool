package actionclassdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basicpackage.BaseTest;

public class ScrollingelementForPractice {

	public static void main(String[] args) throws InterruptedException
	{
		// we have an option to perform scroll operation by using ScroolToElement(); method

		WebDriver driver = BaseTest.LaunchBrowser("https://www.amazon.in/");
		Thread.sleep(0);

		WebElement scrooliing = driver.findElement(By.xpath("//*[@class='a-cardui-header as-title-block']"));


		Actions s = new Actions(driver);
		s.scrollToElement(scrooliing).perform();  //this method for only scrolling

		Thread.sleep(2000);
		//this below method support to scroll the page
		s.scrollByAmount(0, 100).perform();     // this method for srcolling on the basis of pixel value 
		Thread.sleep(3000);   
		WebElement b = driver.findElement(By.xpath("(//*[@class='gw-icon feed-arrow'])[1]"));
		s.contextClick(b).perform();  //this method for right click


	}

}
