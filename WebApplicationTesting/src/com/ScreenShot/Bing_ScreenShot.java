package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bing_ScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		WebDriver driver = null;
		String url="http://bing.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		Thread.sleep(10000);
				
		//TakesScreenshot -its an interface of Selenium WebDriver
		// OutputType - its an interface of Selenium WebDriver
		// type casting
		
		File bing_screenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bing_screenShot, new File("./screenShots/bing1.png"));
		
		driver.quit();

	}

}
