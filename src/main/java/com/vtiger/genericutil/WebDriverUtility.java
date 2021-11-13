package com.vtiger.genericutil;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.google.common.io.Files;

import junit.framework.Assert;

public class WebDriverUtility
{
	public void selectByvisibleText(WebElement element, String vistext)
	{
		Select s = new Select(element);
		s.selectByVisibleText(vistext);
	}
	
	public void selectByValue(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public void selectByIndex(WebElement element, int num)
	{
		Select s = new Select(element);
		s.selectByIndex(num);
	}
	
	public void waitForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void waitForElementtobeVisible(WebDriver driver, WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void mouseHover(WebDriver driver, WebElement element)
    {
    	Actions act = new Actions(driver);
    	act.moveToElement(element).perform();
    }

    public void rightClick(WebDriver driver, WebElement element)
    {
    	Actions act = new Actions(driver);
    	act.contextClick(element).perform();
    }
    
    public void maximiseWin(WebDriver driver)
    {
    	driver.manage().window().maximize();
    }
    
    public void switchToWindow(WebDriver driver, String partialWinTitle)
    {
    	Set<String> window = driver.getWindowHandles();
    	Iterator<String> it = window.iterator();
    	while(it.hasNext())
    	{
    		String winID=it.next();
    		String title = driver.switchTo().window(winID).getTitle();
    		if(title.contains(partialWinTitle))
    		{
    			break;
    		}
    	}
    }

    public void acceptAlert(WebDriver driver)
    {
    	driver.switchTo().alert().accept();
    }

    public void dissmisAlert(WebDriver driver)
    {
    	driver.switchTo().alert().dismiss();
    }
    
    public void switchToFrame(WebDriver driver, WebElement element)
    {
    	driver.switchTo().frame(element);
    }

    public void switchToFrame(WebDriver driver, int index)
    {
    	driver.switchTo().frame(index);
    }

    public void switchToFrame(WebDriver driver, String idOrName)
    {
    	driver.switchTo().frame(idOrName);
    }

    public String takeScreenShot(WebDriver driver, String screenshotName) throws Throwable
    {
    	String screenshotpath="./screenshot/"+screenshotName+".PNG";
    	TakesScreenshot ts = (TakesScreenshot)driver;
    	File src = ts.getScreenshotAs(OutputType.FILE);
    	File dst = new File(screenshotpath);
    	Files.copy(src, dst);
    	return screenshotpath;
    }

    public void scrollToWebElement(WebDriver driver, WebElement element)
    {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	int y = element.getLocation().getY();
    	js.executeScript("window.scrollBy(0,"+y+")", element);
    }
  
    public void pressEnter() throws AWTException
    {
    	Robot rc = new Robot();
    	rc.keyPress(KeyEvent.VK_ENTER);
    	rc.keyRelease(KeyEvent.VK_ENTER);
    }
    
    public void verifyByAssert(String expected, String actual, String page)
    {
    	Assert.assertEquals(expected, actual);
    	Reporter.log(page+" is displayed", true);
    }
}