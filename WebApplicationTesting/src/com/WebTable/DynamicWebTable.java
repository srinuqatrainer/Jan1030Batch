package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		String url="https://www.timeanddate.com/worldclock/";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		
		// xpath of the table on the webPage
		// /html/body/div[1]/div[6]/section[1]/div
		
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div"));
		
		// identifying the total number of rows in the table
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		
		for(int k=0;k<rows.size();k++) // goes to every ROW
		{
			// identify the total number of columns in each Row
			List<WebElement>cols=rows.get(k).findElements(By.tagName("td"));
			
			for(int i=0;i<cols.size();i++) // goes to every row of all Columns
			{
				String data=cols.get(i).getText(); // gets the text of all the columns in the row
				System.out.print(data+" ");
			}
			System.out.println();
			
		}
		driver.quit();

	}

}
