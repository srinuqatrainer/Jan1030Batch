package com.Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Gmail {

	public static void main(String[] args) {


		WebDriver driver = null;
		String url="http://google.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		// <a class="gb_P" data-pid="2" href="https://www.google.co.in/imghp?hl=en&amp;tab=wi">Images</a>
		// <a class="gb_P" data-pid="23" href="https://mail.google.com/mail/?tab=wm">Gmail</a>
		
		driver.findElement(By.className("gb_P")).click();
		
		String title=driver.getTitle();
		System.out.println("The title of the Gmail webPage is : "+title);
		
		

	}

}
