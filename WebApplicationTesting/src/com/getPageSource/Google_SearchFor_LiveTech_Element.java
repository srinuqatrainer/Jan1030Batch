package com.getPageSource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_SearchFor_LiveTech_Element {

	public static void main(String[] args) {

		WebDriver driver = null;
		String url="http://google.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		String expected_Element="LiveTech";
		System.out.println("THe expected element is : "+expected_Element);
		
		String pageSource=driver.getPageSource();
		
		if(pageSource.contains(expected_Element))
		{
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
		
		driver.quit();

	}

}
