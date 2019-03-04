package com.linksTesting;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeaderBlock_Elements_Size_DisplayNames_Testing_CapturingScreenShot {

	public static void main(String[] args) throws IOException {
	WebDriver driver = null;
	String url="https://apsrtconline.in/oprs-web/";
	
	driver = new FirefoxDriver();
	driver.get(url);
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	// HeadBlock of Apsrtc application - property
	// class ="menu-wrap"
	
	WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
	List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
	System.out.println("The total number of links on the header block are : "+
	                                                               headerBlockLinks.size());
	for(int k=0;k<headerBlockLinks.size();k++)
	{
		String headerBlocklinkName=headerBlockLinks.get(k).getText();
		System.out.println(k+" "+headerBlocklinkName);
		
		headerBlockLinks.get(k).click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		File screenShot_apsrtc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShot_apsrtc, new File
				                           ("./screenShots/"+headerBlocklinkName+".png"));
				
		driver.navigate().back();
		
		headerBlock=driver.findElement(By.className("menu-wrap"));
		headerBlockLinks=headerBlock.findElements(By.tagName("a"));
		
	}
	driver.quit();
	}

}
