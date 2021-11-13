package com.vtiger.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.vtiger.genericutil.BaseClass;
import com.vtiger.objectRepository.HomePage;

public class ContactToOrgTest extends BaseClass {

	@Test
	public void contactToOrgTest() throws Throwable {

		// Create Contact with Organization
//		driver.findElement(By.xpath("//a[@href=\"index.php?module=Contacts&action=index\"]")).click();
		HomePage hp = new HomePage(driver);
		hp.clickOnContacts();
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();

		WebElement surname = driver.findElement(By.xpath("//select[@name=\"salutationtype\"]"));
		wUtil.selectByIndex(surname, 1);

		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("Chandra");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Kanth");
		driver.findElement(By.xpath(
				"//input[@name=\"account_name\"]//following-sibling::img[@src=\"themes/softed/images/select.gif\"]"))
				.click();
//		Switch to child window
		String partialWinTitle = "Accounts";
		wUtil.switchToWindow(driver, partialWinTitle);
		driver.findElement(By.xpath("//input[@name=\"search_text\"]")).sendKeys("ARUN");
		driver.findElement(By.xpath("//input[@name=\"search\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Arun320\"]")).click();
		/*
		 * for(String oneWinAddr : allWinAddr) { String oneTitle =
		 * driver.switchTo().window(oneWinAddr).getTitle();
		 * if(!oneTitle.equals(parentTitle)) { driver.switchTo().window(oneWinAddr);
		 * driver.findElement(By.xpath("//input[@name=\"search_text\"]")).sendKeys(
		 * "ARUN"); driver.findElement(By.xpath("//input[@name=\"search\"]")).click();
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("//a[text()=\"ArunSS7\"]")).click(); } }
		 */

		// Switch to Parent window
		String partialWinTitle1 = "Contacts";
		wUtil.switchToWindow(driver, partialWinTitle1);
		/* driver.switchTo().window(parentWinAddr); */
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class=\"crmButton small save\"]")).click();
	}
}