package com.vtiger.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Login
{
	//1. Create separate class for all the WebPage
	
	//2. Locate the element using FindBy,FindBys & FindAll annotation
	
	@FindAll({@FindBy(name="user_name"),@FindBy(xpath="//input[@type='text']")}) //it acts as OR operator
	private WebElement usernameTxtFld;
	
	@FindBys({@FindBy(name="user_password"), @FindBy(xpath="//input[@type='password']")}) //it acts as AND operator
	private WebElement pswdTxtFld;
	
	@FindBy(id="submitButton")
	private WebElement lgnBtn;  //4. Declare all WebElement as private & provide getters methods to access elements in testScript class

	//3. Create constructor to get an Object of the class & initialize the page elements,
	//   by using PageFactory class	
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getUsernameTxtFld() {
		return usernameTxtFld;
	}

	public WebElement getPswdTxtFld() {
		return pswdTxtFld;
	}

	public WebElement getLgnBtn() {
		return lgnBtn;
	}

    //5. Create Buisness Logic for all the classes

	public void loginIntoVtiger(String username,String password)
	{
		usernameTxtFld.sendKeys(username);
		pswdTxtFld.sendKeys(password);
		lgnBtn.click();
	}
}