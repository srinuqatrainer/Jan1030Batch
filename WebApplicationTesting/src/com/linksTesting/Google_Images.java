package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Images {

	public static void main(String[] args) {

		WebDriver driver = null;
		String url="http://google.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// <a class="gb_P" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=wi">Images</a>
		driver.findElement(By.linkText("Images")).click();
		
		System.out.println(driver.getTitle());

	}

}
