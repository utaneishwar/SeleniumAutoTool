package mockParameterisation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Edge {

	@Test
	public void E()
	{
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
	}


}
