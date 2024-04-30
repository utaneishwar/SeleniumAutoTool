package test1;

import org.testng.annotations.Test;



public class SpiritTestClass extends BaseTest1
{

	@Test (priority=4)
	public void SelectTest()
	{
	spirit.selectDropdown();
	}
	
	@Test(priority=5)
	public void sortbyHigher()
	{
		spirit.sortDropdown("Price High to Low");
	}
	
	
	@Test(priority=6)
	public void sortbyalphabates()
	{
		
		spirit.sortDropdown("Name Z - A");
	}
	
	
	
	
	
	
}
