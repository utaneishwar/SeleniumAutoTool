package pagess;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import navigationbasics.FindElements;

public class AddToCart 
{
	// In this Class We Discussed about PageFactory
	// PageFactory : It is Class  in which have "initElements" by using this method we initialize WebElements at one go
  // WebElement	
   WebDriver driver;
   WebDriverWait wait; 
   @FindBy(xpath ="//*[@id='term-656']")
   WebElement amrutcheckbox;
          @FindBy(xpath ="//*[@id='term-5']")
           WebElement size;
   @FindBy(xpath = "//*[text()='APPLY']")
   WebElement applybutton;
          @FindBy(xpath = "//*[text()='ADD TO CART']")
	         WebElement addtocartbutton;
          
    @FindBy(xpath="//*[@class='typeahead__list']")
        List <WebElement> searchresults;
           
   @FindBy(xpath = "//*[@name='q']")
   WebElement searchbox;
   
  
	//Constructor: here we used page factory to initialize the webelement 
   
    public AddToCart (WebDriver driver)
    {
	this.driver=driver;
	PageFactory.initElements(driver,this);  // this is used to for it will access all the Webelement inside and act as object
	wait=new WebDriverWait(driver, Duration.ofSeconds(60));

     }
   
  //methods
    public void SelectBrandSize() throws InterruptedException
    {
    	Thread.sleep(3000);
    	amrutcheckbox.click();
    	applybutton.click();
    	size.click();
    }
    public void AddItemsCart()
    {
    	addtocartbutton.click();
    }
   
    public void SearchItemsString(String SearchText)
    {  // wait.until(ExpectedConditions.visibilityOf(searchbox));   // if we get interactable exception that time used
    	searchbox.sendKeys(SearchText);       
    }
  
     public void getSearchResults()
    { 
    	 wait.until(ExpectedConditions.visibilityOfAllElements(searchresults));
   	 
	      for(WebElement result:searchresults)
	      {
	    	String value = result.getText();  
	    	System.out.println(value);
           }
    
   
   
}
     }
