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

public class IccCricketTest {
	@Test
	public void iccCricketTest() {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> allTeams = driver.findElements(By.xpath("//table[@class='table']//tr[*]//td[2]"));
		List<WebElement> allMatches = driver.findElements(By.xpath("//table[@class='table']//tr[*]//td[3]"));
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();		
		
		for(int i=1; i<allMatches.size(); i++)
		{
			int int_OneMatch = Integer.parseInt(allMatches.get(i).getText());
			String str_OneTeam = allTeams.get(i).getText();
			
			hm.put(str_OneTeam, int_OneMatch);
		}
		
		int maxMatches = Collections.max(hm.values());

		for(Entry<String, Integer> entry : hm.entrySet())
		{
			if(entry.getValue()==maxMatches)
			{
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
	}
}