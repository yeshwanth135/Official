package com.vtiger.testcases;

import org.testng.annotations.Test;

import com.vtiger.genericutil.BaseClass;
import com.vtiger.genericutil.JavaUtility;
import com.vtiger.objectRepository.CreateOrganisation;
import com.vtiger.objectRepository.HomePage;
import com.vtiger.objectRepository.OrganizationPage;

public class OrgIndustryTest extends BaseClass {

	@Test
	public void orgIndustryTest() throws Throwable
	{
		String orgName = eUtil.excelUtility("sheet1", 9, 1) + JavaUtility.generateRandomNumber();
		String indText = eUtil.excelUtility("sheet1", 8, 1);
		
		HomePage hp = new HomePage(driver);
		hp.clickOnOrganisation();

		OrganizationPage op = new OrganizationPage(driver);
		op.clickOnCreateOrg();
		
		CreateOrganisation co = new CreateOrganisation(driver);
		co.createOrgNamewithIndustry(orgName, indText);
	}
}