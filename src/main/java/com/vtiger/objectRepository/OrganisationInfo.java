package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OrganisationInfo {
	public OrganisationInfo(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "dvHeaderText")
	private WebElement orgInfo;

	/**
	 * @return the orgInfo
	 */
	public WebElement getOrgInfo() {
		return orgInfo;
	}

	public void verifyOrgName(String organisationName) {
		String organisationInfo = orgInfo.getText();
		Assert.assertTrue(organisationInfo.contains(organisationName));
	}
}
