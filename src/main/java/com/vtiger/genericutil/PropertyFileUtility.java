package com.vtiger.genericutil;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFileUtility
{
	@Test
	public String propertyFileUtility(String key) throws Throwable
	{
		FileInputStream fis = new FileInputStream(IPathConstant.PropertyFilePath);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key, "Please give correct key");
		return value;
//					OR
//		return p.getProperty(key, "Please give correct key");
	}
}