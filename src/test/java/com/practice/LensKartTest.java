package com.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LensKartTest
{
	@Test
	public void lensKartTest()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.lenskart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='search_input-bar autoSuggest']")).click();
		List<WebElement> trending = driver.findElements(By.xpath("//ul[@class='trending_list menu-link']//li"));
		for (int i = 0; i <trending.size(); i++)
		{
			System.out.println(trending.get(i).getText());
		}
	}
	
	
	@Test
	public void iccMatchesTest()
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver1.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		List<WebElement> teams = driver.findElements(By.xpath("//table/tbody/tr[*]/td[2]"));
		List<WebElement> matches = driver.findElements(By.xpath("//table/tbody/tr[*]/td[3]"));
		HashMap<String, Integer> hp = new HashMap<String, Integer>();
		
		for(int i=1; i<teams.size(); i++)
		{
			int matches_int = Integer.parseInt(matches.get(i).getText());
			String team_name = teams.get(i).getText();
			hp.put(team_name, matches_int);
			
		}
		
		int maxValueinMap = (Collections.max(hp.values()));
		for(Entry<String, Integer> entry:hp.entrySet())
		{
			if(entry.getValue()==maxValueinMap)
			{
			System.out.println(entry.getKey()+" "+entry.getValue());	
			}
		}
	}
}