package DDT.practice;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

/**
 * This class for reading data from JSON file
 * @author venkat
 *
 */
public class ReadTheDataFromJSONFileTest
{
	@Test
	public void readTheDataFromJSONFileTest() throws Throwable
	{
	//Step=1 convert the JSON File into JSON Object
		FileReader fr = new FileReader("./Data/commonData.json");
		
	//Step=2 convert JSON Object into Java Object
		JSONParser jp = new JSONParser();
		 Object jobj = jp.parse(fr);
		
	//step=3 Read the data using HashMap
		HashMap obj =(HashMap)jobj;
		Object value = obj.get("username");
		System.out.println(value);
	}
}
