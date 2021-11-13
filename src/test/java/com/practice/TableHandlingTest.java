package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableHandlingTest
{
	@Test
	public void tableHandlingTest() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[@href=\"index.php?module=Accounts&action=index\"]")).click();
//		List<WebElement> allOrgName = driver.findElements(By.xpath("//table[@class=\"lvt small\"]//tr[*]//td[3]//a[@title=\"Organizations\"]"));
//		
//		String originalText = driver.findElement(By.xpath("//a[text()='Arun472']")).getText();
//		
//		for(WebElement oneOrgName : allOrgName)
//		{
//			String oneText = oneOrgName.getText();
//			System.out.println(oneText);
//			if(oneText.equalsIgnoreCase(originalText))
//			{
//				Thread.sleep(5000);
//				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//				driver.findElement(By.xpath("//a[text()='"+originalText+"']/ancestor::tr[@class='lvtColData']//input[@name='selected_id']")).click();
//				Reporter.log("Dropdown is Clicked", true);
//				break;
//			}
//		}
	}
}