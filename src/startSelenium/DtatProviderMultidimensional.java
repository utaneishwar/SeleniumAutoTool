package startSelenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DtatProviderMultidimensional
{

	//It is used to supply test data to the test methods allowing to execute the 
	//same test method with different data sets

	@DataProvider (name="user")
	public String [][] data()
	{
		String [][]data= {{"Ishwar","123","Nagpur"},{"Iayur","123","Pune"}};
		return data;
	}

	@Test (dataProvider="user")
	public void method(String username, String password, String city)
	{
		System.out.println(username);
		System.out.println(password);
		System.out.println(city);

	}
}
