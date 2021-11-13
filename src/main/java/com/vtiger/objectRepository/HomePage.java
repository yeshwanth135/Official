package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericutil.WebDriverUtility;

public class HomePage extends WebDriverUtility {
	WebDriver driver;

	@FindBy(linkText = "Organizations")
	private WebElement orgLink;

	@FindBy(linkText = "Contacts")
	private WebElement contactLink;

	@FindBy(xpath = "//img[@src=\"themes/softed/images/info.PNG\"]")
	private WebElement admImg;

	@FindBy(linkText = "Sign Ou//at")
	private WebElement signOutBtn;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgLink() {
		return orgLink;
	}

	public WebElement getContactLink() {
		return contactLink;
	}
	
	public WebElement getAdmImg() {
		return admImg;
	}

	public WebElement getSignOutBtn() {
		return signOutBtn;
	}

	/**
	 * Business logic for clicking on Organization
	 */
	public void clickOnOrganisation() {
		orgLink.click();
	}
	
	public void clickOnContacts() {
		contactLink.click();
	}

	public void signOutFromVtiger() throws Throwable {
		mouseHover(driver, admImg);
		Thread.sleep(4000);
		signOutBtn.click();
	}
}