package DDT.practice;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadTheDataFromPropertiesFileTest
{
	@Test
	public void readDataFromPropFileTest() throws Throwable
	{
		FileInputStream fis = new FileInputStream("./Data/commonDataSDET_2.properties");
		Properties p = new Properties();
		p.load(fis);
		String URL = p.getProperty("url", "Incorrect Key");
		String UN = p.getProperty("username", "Incorrect Key");
		String PWD = p.getProperty("password", "Incorrect Key");
		System.out.println("first"+URL);
		System.out.println("first"+UN);
		System.out.println("first"+PWD);
		
	}
}