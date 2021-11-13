package com.vtiger.testcases;

import org.testng.annotations.Test;

public class CheckPriority
{
	@Test(priority=1, dependsOnMethods = "demo")
	public void sumo()
	{
		System.out.println("sumo method");
	}
	@Test(priority=0)
	public void remo()
	{
		System.out.println("remo method");
	}
	@Test(priority=2)
	public void demo()
	{
		System.out.println("demo method");
	}
	@Test(priority=-1)
	public void promo()
	{
		System.out.println("promo method");
	}
}