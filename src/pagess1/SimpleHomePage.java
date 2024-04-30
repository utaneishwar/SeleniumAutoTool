package pagess1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SimpleHomePage 
{  
	WebDriver driver1;

	  @FindBy(xpath ="//*[@type='file']")
	   WebElement pickphoto;
	 @FindBy(xpath = "//*[@class='name']")
	 WebElement name;
	 @FindBy(xpath = "//*[@id='g2599-email']")
	 WebElement gmail;
	 @FindBy(xpath = "//*[@id='g2599-website']")
	 WebElement website;
	 
	 @FindBy(xpath = "//*[@class='select']")
	 WebElement dropdown;
	
	 
	 @FindBy(xpath = "//*[normalize-space(text())='Automation Testing']")
	 WebElement AutomationTesting;
	@FindBy(xpath = "(//*[@class='radio'])[1]")
	WebElement graduate;
	
	@FindBy(xpath = "//*[@id='contact-form-comment-g2599-comment']")
	WebElement comment;
	@FindBy(xpath = "//*[@class='pushbutton-wide']")
	WebElement submit;
	
   public SimpleHomePage(WebDriver driver1) 
   {
	this.driver1= driver1;
	
	PageFactory.initElements(driver1, this);
	}
   
   public void profile(String file, String first,String g,String web)
   {
	   pickphoto.sendKeys(file); 
	   name.sendKeys(first);
	  gmail.sendKeys(g);
	   website.sendKeys(web);
   }
   
   public void DropDownAndSelect()
   { 
	   dropdown.click(); 
	   AutomationTesting.click();
	   graduate.click();
	   
   }
   public void CommentAndSubmit(String text)
   {   comment.sendKeys(text);
	   submit.click(); 
	  
	   
   }


	
}
   
	
	
	

