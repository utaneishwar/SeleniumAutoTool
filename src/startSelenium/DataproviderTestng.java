package startSelenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderTestng 
{	@Test(dataProvider="userone")
	public void dataprovider(String username, String password)
	{
		System.out.println("username is: "+username +" || password is: "+password);
	}
	@DataProvider(name="userone")
	public String [][]supplydata()
	{
		
		String [][]data= {{"Aditya","123"}, {"Bimla","345"}};
		return data;
	}
	public static void main(String[] args) 
	{
		DataproviderTestng pro =new DataproviderTestng();
		pro.dataprovider("Ishwar", "123");
		pro.supplydata();
	}
}
