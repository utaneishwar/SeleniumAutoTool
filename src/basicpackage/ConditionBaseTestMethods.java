package basicpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ConditionBaseTestMethods {

	public static void main(String[] args) 

	{ // in this class we discussed Basic Three methods 
		//1)isDisplay(); :   it is method which is used used to verify wheather the webelement is getting display or not over the page
		//if it  is display over the webpage then it will return True value if it is hidden then it will return  false 
		// if it is not present inside Dom then it will throw NoSuchElementException .

		WebDriver driver = BaseTest.LaunchBrowser("https://www.amazon.in/");
		WebElement carticon = driver.findElement(By.xpath("//*[@id='nav-cart']"));
		boolean isdisplay = carticon.isDisplayed();
		System.out.println(isdisplay);     // true

		WebElement hiddenElement = driver.findElement(By.xpath("//*[@id='glowValidationToken']")) ;      
		boolean isdisplay2 = hiddenElement.isDisplayed();
		System.out.println(isdisplay2);   // false

		//2) isEnable;:  it will return true  if the webelement is enable to perform action other wise it ewill return false

		WebElement searchbox = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")) ;     

		boolean isenable = searchbox.isEnabled();
		System.out.println( isenable );            // true
	}
	//----------------------------------------------------------------------------------	
	//3)isSelected (); : This is method which will return true if the element will be already selected /checked otherwise it will return false if the element is unselected 

	@Test
	public void isSelectedValidation() 
	{

		WebDriver driver = BaseTest.LaunchBrowser("https://www.facebook.com/signup");
		WebElement radiobutton = driver.findElement(By.xpath("//*[@type='radio' and @value = '1']"));

		System.out.println("Before selecting status");

		boolean isselected = radiobutton.isSelected();

		System.out.println(isselected);          //false because element will not be Selected

		radiobutton.click();

		System.out.println("After selecting status");
		boolean isselectedafter = radiobutton.isSelected();

		System.out.println(isselectedafter);       //True  element will be Selected and we can perform action ion that webElemet

	}
	//	 Output:
	//
	//
	//		 Before selecting status
	//		 false
	//		 After selecting status
	//		 true




}





