package com.TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.NewTours.Pages.WelComeMercuryTours;
import com.lib.BaseTest;

public class TC_101 extends BaseTest
{
	@Test
	public void newTours_HomePage() throws IOException
	{
	WelComeMercuryTours wmt = PageFactory.initElements(driver, WelComeMercuryTours.class);
		
		wmt.SignOn();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt.register();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		FileInputStream file = new FileInputStream("./src/com/ApplicationTestDataFiles/NewTours_LogInTestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowCount;i++)
		{
			Row r=sheet.getRow(i);
			
		wmt.logIn(r.getCell(0).getStringCellValue(), r.getCell(1).getStringCellValue());
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		String expectedTitle="Find";
		System.out.println("The expected title is : "+expectedTitle);

		String actualTitle=driver.getTitle();
		System.out.println("THe actual title is : "+actualTitle);
		
		if(actualTitle.contains(expectedTitle))
		{
			System.out.println("LogIn Successfull - PASS");
			r.createCell(2).setCellValue("LogIn Successfull - PASS");
		}
		else
		{
			System.out.println(" LogIn Failed - FAIL");
			r.createCell(2).setCellValue("LogIn Failed - FAIL");
		}

		FileOutputStream file1 = new FileOutputStream("./src/com/ApplicationTestResultFiles/LogInTestResult.xlsx");
		wb.write(file1);
		
		driver.navigate().back();
		
		
		}
	}

}
