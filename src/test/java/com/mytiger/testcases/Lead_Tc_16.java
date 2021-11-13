package com.mytiger.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.vtiger.genericutil.BaseClass;
import com.vtiger.genericutil.JavaUtility;

public class Lead_Tc_16 extends BaseClass {
	@Test(groups = "smokeTest")
	public void newLeadInvalidMail() throws Throwable {
		wUtil.verifyByAssert(pUtil.propertyFileUtility("hometitle"), driver.getTitle(), "home");
		driver.findElement(By.xpath("//a[@href=\"index.php?module=Leads&action=index\"]")).click();
		driver.findElement(By.xpath("//img[@title=\"Create Lead...\"]")).click();

		wUtil.waitForPageLoad(driver);
		wUtil.selectByIndex(driver.findElement(By.xpath("//select[@name=\"salutationtype\"]")), 1);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys(eUtil.excelUtility("sheet1", 1, 1));
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys(eUtil.excelUtility("sheet1", 2, 1));
		driver.findElement(By.xpath("//input[@name=\"company\"]"))
				.sendKeys(eUtil.excelUtility("sheet1", 3, 1) + JavaUtility.generateRandomNumber());
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(eUtil.excelUtility("sheet1", 4, 2));
		driver.findElement(By.xpath("//input[@id=\"secondaryemail\"]")).sendKeys(eUtil.excelUtility("sheet1", 5, 2));
		driver.findElement(By.xpath("//input[@class=\"crmButton small save\"]")).click();

		wUtil.acceptAlert(driver);
	}
}