package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MakeMyTripCalender {
	@Test
	public void makeMyTripCalender() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class=\"langCardClose\"]")).click();
		driver.findElement(By.xpath("//div[@data-cy=\"outsideModal\"]")).click();
		driver.findElement(By.xpath("//label[@for=\"fromCity\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"react-autosuggest__input react-autosuggest__input--open\"]"))
				.sendKeys("DEL");
		driver.findElement(By.xpath("//div[contains(text(),'DEL')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@aria-controls=\"react-autowhatever-1\"]")).sendKeys("PNQ");
		driver.findElement(By.xpath("//div[contains(text(),'PNQ')]")).click();

		for (int i = 0; i < 11; i++) {
			try {
				driver.findElement(By.xpath("//div[@aria-label='Sat Jun 18 2022']")).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}
}
