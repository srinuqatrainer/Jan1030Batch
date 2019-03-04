package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstColumn_Data {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="https://www.timeanddate.com/worldclock/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// xpath of Accra Element 
	// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		
String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
	String part2="]/td[1]";
		
		for(int k=1;k<=36;k++)
		{
			
//String cityName=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+k+"]/td[1]"))                                                                                .getText();
			
			String cityName=driver.findElement(By.xpath(part1+k+part2)).getText();
			System.out.println(cityName);
		}
			driver.close();
		

	}

}
