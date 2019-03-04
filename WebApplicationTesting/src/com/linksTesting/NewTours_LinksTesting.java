package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LinksTesting {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
				
		// getting all the elements which are of type links - with anchor tag 
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		// finding the size of the links arrayList
		int linksCount=links.size();
		
System.out.println("The total number of links on the newTours Home page are :"+linksCount);
		
		// displaying all the link Names saved in the arrayList
		for(int i=0;i<linksCount;i++)
			{
			
			if(links.get(i).isDisplayed())
			{
						
			String linkName=links.get(i).getText();
			System.out.println(i+" "+"The name of the link is : "+linkName);
			
			links.get(i).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			// re creating the array list
			links=driver.findElements(By.tagName("a"));
			
			}
		}
		driver.quit();


	}

}
