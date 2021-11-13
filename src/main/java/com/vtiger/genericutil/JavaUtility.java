package com.vtiger.genericutil;

import java.util.Random;

import org.testng.annotations.Test;

public class JavaUtility 
{
	@Test
	public static int generateRandomNumber()
	{
		Random r = new Random();
		int num = r.nextInt(1000);
		return num;
	}
}
