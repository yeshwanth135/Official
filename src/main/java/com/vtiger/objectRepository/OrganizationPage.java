package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {

	public OrganizationPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createOrgBtn;

	/**
	 * @return the createOrgBtn
	 */
	public WebElement getCreateOrgBtn() {
		return createOrgBtn;
	}

	/**
	 * Buisness logic to click on create organisation
	 */
	public void clickOnCreateOrg() {
		createOrgBtn.click();
	}
}
