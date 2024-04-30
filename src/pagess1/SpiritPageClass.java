package pagess1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SpiritPageClass 
{
	 // WebElement
   WebDriver  driver;
   
    By spirit =By.xpath("(//*[normalize-space(text())='SPIRITS'])[2]");
	By maltwiskey=By.xpath("(//*[text()='Malt Whiskey'])[2]");
	By  sortsearch =By.xpath("//*[@id='ddlProductSortyBy']");
	
	// Constructor
    public  SpiritPageClass (WebDriver driver)
   {
	 this.driver=driver;
	 
  }
	
     public void selectDropdown()
     {
    	 driver.findElement(spirit).click();
    	 driver.findElement(maltwiskey).click();
     }
	
     public void sortDropdown(String visible)
     {
    	WebElement dropdown = driver.findElement(sortsearch);
    	Select sel = new Select( dropdown);
    	sel.selectByVisibleText(visible);
     }
   }

	
	
	
	


