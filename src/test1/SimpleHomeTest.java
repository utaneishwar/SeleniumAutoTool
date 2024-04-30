package test1;

import org.testng.annotations.Test;

public class SimpleHomeTest extends BaseTest1
{
	
	
	@Test (priority=1)
	public void profileIshwar()
	{
		homepage.profile
		("C:\\\\Users\\\\intel\\\\Desktop\\\\WhatsApp Image 2023-04-28 at 13.10.11.jpg","ishwar","utaneishwar@gmail.com", "www.facebook.com");
	}
	@Test (priority=2)
	public void Ishwarinfo()
	{
		homepage.DropDownAndSelect();
	}
	@Test (priority=3)
	public void submit()
	{
		homepage.CommentAndSubmit("Automation testing is done");
	}

}
