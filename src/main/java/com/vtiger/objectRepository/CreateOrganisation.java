package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericutil.WebDriverUtility;

public class CreateOrganisation extends WebDriverUtility {

	WebDriver driver;
	public CreateOrganisation(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="accountname")
	private WebElement orgName;
	
	@FindBy(name="industry")
	private WebElement indType;

	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveBtn;

	/**
	 * @return the orgName
	 */
	public WebElement getOrgName() {
		return orgName;
	}

	/**
	 * @return the indType
	 */
	public WebElement getIndType() {
		return indType;
	}

	/**
	 * @return the saveBtn
	 */
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	/**
	 * 
	 * @param organisationName
	 */
	public void createOrgName(String organisationName)
	{
		orgName.sendKeys(organisationName);
		saveBtn.click();
	}
	
	/**
	 * 
	 * @param organisationName
	 * @param visText 
	 */
	public void createOrgNamewithIndustry(String organisationName, String visText)
	{
		orgName.sendKeys(organisationName);
		selectByvisibleText(indType, visText);
		saveBtn.click();
	}
}