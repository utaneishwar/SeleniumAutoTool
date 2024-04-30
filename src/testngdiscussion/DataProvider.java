package testngdiscussion;

import org.testng.annotations.Test;
public class DataProvider 
{
	@Test(dataProvider = "userone")
	public void demo(String username,String password)
	{
		System.out.println("Username is : "+username+" || password is : "+password);
	}
	@org.testng.annotations.DataProvider(name="userone")
	public String [][]supplydata()
	{
		String [][]data= {{"Aditya","123"},{"Kaushik","345"}};
		return data;
	}
	public static void main(String[] args) 
	{
		DataProvider dp =new DataProvider();
		dp.demo("mala", "1405");
         dp.supplydata();
	}

}
