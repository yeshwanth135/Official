package com.mytiger.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.genericutil.BaseClass;
import com.vtiger.genericutil.JavaUtility;

@Listeners(com.vtiger.genericutil.ListenersImp.class)
public class Lead_Tc_17 extends BaseClass {
	@Test(groups = "regTest")
	public void newLeadValidMobile() throws Throwable {
		driver.findElement(By.xpath("//a[@href=\"index.php?module=Leads&action=index\"]")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Lead...\"]")).click();

		wUtil.waitForPageLoad(driver);
		wUtil.selectByIndex(driver.findElement(By.xpath("//select[@name=\"salutationtype\"]")), 1);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys(eUtil.excelUtility("sheet1", 1, 1));
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys(eUtil.excelUtility("sheet1", 9, 1));
		driver.findElement(By.xpath("//input[@name=\"company\"]"))
				.sendKeys(eUtil.excelUtility("sheet1", 3, 1) + JavaUtility.generateRandomNumber());
		driver.findElement(By.id("phone")).sendKeys(eUtil.excelNumericValue("sheet1", 6, 1));
		driver.findElement(By.id("mobile")).sendKeys(eUtil.excelNumericValue("sheet1", 7, 1));
		driver.findElement(By.xpath("//input[@class=\"crmButton small save\"]")).click();
	}
}