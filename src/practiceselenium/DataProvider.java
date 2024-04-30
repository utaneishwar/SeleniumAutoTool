package practiceselenium;


import org.testng.annotations.Test;

public class DataProvider 
{
	@Test(dataProvider = "userone")
	public void  login(String user, String pass)
	{
		System.out.println(user+": is username and password is:"+pass);
	}
	
	
	@org.testng.annotations.DataProvider(name="userone")
	public  String [][] supplyTestdata() 
	{
		String [][]data= {{"Dhanashree","123"},{"sonu","456"}};
		return data;
	}

}
