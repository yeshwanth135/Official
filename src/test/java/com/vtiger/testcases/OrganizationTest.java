package com.vtiger.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.vtiger.genericutil.BaseClass;
import com.vtiger.genericutil.JavaUtility;

public class OrganizationTest extends BaseClass
{
	@Test(groups = "smokeTest")
	public void orgAccCreateTest() throws Throwable
	{
		driver.findElement(By.xpath("//a[@href=\"index.php?module=Accounts&action=index\"]")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys(eUtil.excelUtility("sheet1", 1, 2) + JavaUtility.generateRandomNumber());
		driver.findElement(By.xpath("//input[@class=\"crmbutton small save\"]")).click();
		System.out.println("smoke Test");
		Thread.sleep(3000);
	}
	
	@Test(groups = "regTest")
	public void orgIndustryTest() throws Throwable
	{
		driver.findElement(By.xpath("//a[@href=\"index.php?module=Accounts&action=index\"]")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Organization...\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"accountname\"]")).sendKeys("ArunKumarSS"+"--"+JavaUtility.generateRandomNumber());
		
		WebElement sdd = driver.findElement(By.xpath("//select[@name=\"industry\"]"));
		wUtil.selectByIndex(sdd, 3);
		 
		driver.findElement(By.xpath("//input[@class=\"crmbutton small save\"]")).click();
		System.out.println("regretion Test");
		Thread.sleep(3000);
	}
}