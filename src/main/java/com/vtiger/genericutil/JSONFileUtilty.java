package com.vtiger.genericutil;

import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.parser.JSONParser;
import org.testng.annotations.Test;

public class JSONFileUtilty
{
	@Test
	public String jsonFileUtility(String key) throws Throwable
	{
		FileReader fr = new FileReader(IPathConstant.JsonFilePath);
		JSONParser jp = new JSONParser();
		Object jpObj = jp.parse(fr);
		HashMap hmObj = (HashMap)jpObj;
		return (String) hmObj.get(key);
	}
}