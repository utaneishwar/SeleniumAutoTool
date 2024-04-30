package test;


import org.testng.annotations.Test;
public class SpiritTest extends BaseTest
{
 

	@Test(priority=4)
	public void selectProduct()
	{
       spirit.selectSpirits(); 
	
	}
	@Test(priority=5)
	public void SortByHighPrice()
	{
      spirit.sortDropdown("Price High to Low"); 
		
	}
	

	@Test(priority=6)
	public void SortByAlphabates()
	{
    spirit.sortDropdown("Name A - Z");
		
	}
	
	
	
}
