package com.vtiger.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.genericutil.BaseClass;
import com.vtiger.genericutil.JavaUtility;
import com.vtiger.objectRepository.CreateOrganisation;
import com.vtiger.objectRepository.HomePage;
import com.vtiger.objectRepository.OrganizationPage;

public class OrgAccCreateTest extends BaseClass {

	@Test(invocationCount = 10)
	public void orgAccCreateTest() throws Throwable {

		HomePage hp = new HomePage(driver);
		hp.clickOnOrganisation();

		OrganizationPage op = new OrganizationPage(driver);
		op.clickOnCreateOrg();

		CreateOrganisation co = new CreateOrganisation(driver);
		co.createOrgName(eUtil.excelUtility("sheet1", 9, 1) + JavaUtility.generateRandomNumber());
	}
}
 