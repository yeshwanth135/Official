package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Olympicsmedals {
	@Test
	public void olympicsmedals() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://olympics.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='Yes, I am happy']")).click();
		Thread.sleep(3000);

		List<WebElement> athleteNames = driver.findElements(By.xpath(
				"//ul[@class='b2p-list  featured-athletes--4']//a[@class='featured-athlete__name d-flex text-body']"));
		List<WebElement> medals = driver
				.findElements(By.xpath("//div[@class='featured-athlete__medals text-body-sm']"));

		for (int i = 0; i < athleteNames.size(); i++) {

			System.out.println(athleteNames.get(i).getText());
			System.out.println(medals.get(i).getText());

		}
	}
}