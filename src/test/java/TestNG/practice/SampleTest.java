package TestNG.practice;

import org.testng.annotations.*;

public class SampleTest
{
	@BeforeSuite
	public void connectDB()
	{
		System.out.println("Connect the Database");
	}
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Open the Browser");
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("Login to Application");
	}
	
	@Test
	public void CreateOrg()
	{
		System.out.println("Create Organization");
	}
	
	@AfterClass
	public void logout()
	{
		System.out.println("Logout from Application");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Close the Browser");
	}
	
	@AfterSuite
	public void disconnectDB()
	{
		System.out.println("DisConnect the Database");
	}
}