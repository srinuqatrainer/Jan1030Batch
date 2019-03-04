package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_Automation {

	public static void main(String[] args) {
	
		// chrome Browser
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		
		// fireFox Browser
		
		System.setProperty("webdriver.gecko.driver", "./driverFiles/geckodriver.exe");
		FirefoxDriver f = new FirefoxDriver();
		
		
		// Edge Browser
		System.setProperty("webdriver.edge.driver", "./driverFiles/MicrosoftWebDriver.exe");
		EdgeDriver e = new EdgeDriver();
		
		// Internet Explorer
		System.setProperty("webdriver.ie.driver", "./driverFiles/IEDriverServer.exe");
		InternetExplorerDriver dr = new InternetExplorerDriver();
		

	}

}
