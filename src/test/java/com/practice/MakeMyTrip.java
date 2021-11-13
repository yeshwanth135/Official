package com.practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeMyTrip {

	@Test(dataProvider = "givingData")
	public void makeMyTripTest(String src, String dest) throws Throwable {
		
		Date d = new Date();
		System.out.println(d);
		String sd = d.toString();
		String[] arr = sd.split(" ");
		String day = arr[0];
		String month = arr[1];
		String currentDate = arr[2];
		String year = arr[5];
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class=\"langCardClose\"]")).click();
		driver.findElement(By.xpath("//div[@data-cy=\"outsideModal\"]")).click();
		driver.findElement(By.xpath("//label[@for=\"fromCity\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"react-autosuggest__input react-autosuggest__input--open\"]")).sendKeys(src);
		driver.findElement(By.xpath("//div[contains(text(),'"+src+"')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@aria-controls=\"react-autowhatever-1\"]")).sendKeys(dest);
		driver.findElement(By.xpath("//div[contains(text(),'"+dest+"')]")).click();
//		driver.findElement(By.xpath("//label[@for=\"departure\"]")).click();
		driver.findElement(By.xpath("//div[@aria-label='"+day+" "+month+" "+currentDate+" "+year+"']")).click();
		
		driver.close();
		
	}
	
	@DataProvider
	public Object[][] givingData()
	{
		Object[][] arr = new Object[5][2];
		
		arr[0][0]="PNQ";
		arr[0][1]="HYD";
		
		arr[1][0]="BLR";
		arr[1][1]="MAA";
		
		arr[2][0]="CCU";
		arr[2][1]="HYD";
		
		arr[3][0]="PNQ";
		arr[3][1]="HYD";
		
		arr[4][0]="BOM";
		arr[4][1]="PNQ";
		return arr;
	}
}