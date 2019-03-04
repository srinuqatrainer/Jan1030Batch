package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapturingCompleteTableData {

	public static void main(String[] args) {
		

		WebDriver driver = null;
		String url="https://www.timeanddate.com/worldclock/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// xpath of Accra Element 
	// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
	// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String part2="]/td[";
		String part3="]";
		
		for(int k=1;k<=36;k++)
		{
			for(int p=1;p<=8;p++)
			{
				String data=driver.findElement(By.xpath(part1+k+part2+p+part3)).getText();
				System.out.print(data+" ");
			}
			System.out.println();
		}
	driver.quit();

	}

}
