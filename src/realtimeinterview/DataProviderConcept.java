package realtimeinterview;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept 
{
	@Test(dataProvider ="usersupplone")
	public void login(String username, String password)
	{
		System.out.print("username is :"+username+" and "+password);
	}
	
	@DataProvider(name="usersupplone")
	public String[][]SupplyTestData()
	{
		
		String [][]data= {{"Aditya","123"},{"Payal","345"},{"Kishor","456"},{"vishal","789"}};
		return data;
	}

}
