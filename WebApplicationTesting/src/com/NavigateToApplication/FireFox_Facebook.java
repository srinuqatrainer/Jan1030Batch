package com.NavigateToApplication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox_Facebook {

	public static void main(String[] args) {

		WebDriver driver= null;
		String url="http://www.facebook.com";
		
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		 driver = new FirefoxDriver();
		
		driver.get(url);
		
		//driver.navigate().to("http://google.com");
		
		//driver.close();
		
		driver.quit();	
		

	}

}
