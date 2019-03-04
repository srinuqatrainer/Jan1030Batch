package com.ApplicationDataToExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Country_Export_Excel {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = null;
		String url="http://newtours.demoaut.com";
		
		driver = new FirefoxDriver();
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// <a href="mercuryregister.php">REGISTER</a>
		
		Thread.sleep(10000);
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		register.click();
		
		// name="country" - property of Country Element 
		WebElement country=driver.findElement(By.name("country"));
		
		List<WebElement>countries=country.findElements(By.tagName("option"));
		
		int countriesCount=countries.size();
		
		System.out.println("The total number of countries are : "+countriesCount);
		
		FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
				
		for(int k=0;k<countriesCount;k++)
		{
			Row r=sheet.createRow(k);
			Cell c=r.createCell(0);
			
			String countryName=countries.get(k).getText();
			System.out.println("The name of the Country is : "+countryName);
			
			c.setCellValue(countryName);
			
			FileOutputStream file1 = new FileOutputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
			workBook.write(file1);
		}
		
	driver.quit();
		
		

	}

}
