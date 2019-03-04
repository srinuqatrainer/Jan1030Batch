package com.DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LogInTest extends BaseTest {
	
	@Test
	public void logIn() throws IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\srinivas1\\Desktop\\Jan 1030 Batch\\WebApplicationTesting\\src\\com\\ApplicationTestDataFiles\\NewTours_LogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int a=1;a<=rowCount;a++)
		{
			Row r=sheet.getRow(a);
		// <input type="text" name="userName" size="10">
		
		driver.findElement(By.name("userName")).sendKeys(r.getCell(0).getStringCellValue());
		
		driver.findElement(By.name("password")).sendKeys(r.getCell(1).getStringCellValue());
		
		driver.findElement(By.name("login")).click();
		
		String expected_Title="Find";
		
		System.out.println(" The expected Title is : "+expected_Title);
		
		String actual_Title=driver.getTitle();
		
		System.out.println(" the actuat title is : "+actual_Title);
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println(" LogIn Successfull -- PASS");
			r.createCell(2).setCellValue("LogIn Successfull -- PASS");
		}
		else
		{
			System.out.println(" LogIn failed - FAIL");
			r.createCell(2).setCellValue("LogIn failed - FAIL");
		}
		
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\srinivas1\\Desktop\\Jan 1030 Batch\\WebApplicationTesting\\src\\com\\ApplicationTetResultFiles\\NewTours_LogInTestResult.xlsx");
		workBook.write(file1);
		
		driver.navigate().back();
		
	}	
	}
	
	
	

}
