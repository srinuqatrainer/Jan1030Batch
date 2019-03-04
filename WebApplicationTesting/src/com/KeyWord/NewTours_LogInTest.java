package com.KeyWord;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class NewTours_LogInTest extends BaseTest
{

	@Test
	public void logIn() throws IOException
	{
		FileInputStream file= new FileInputStream("./src/com/ApplicationTestDataFiles/NewTours_LogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		FileInputStream file2 =  new FileInputStream("./NewTours.properties");
		Properties pr = new Properties();
		pr.load(file2);
		
		int rowCount=sheet.getLastRowNum();
		
		for(int a=1;a<=rowCount;a++)
		{
			Row r=sheet.getRow(a);
				
driver.findElement(By.name(pr.getProperty("uName"))).
                                          sendKeys(r.getCell(0).getStringCellValue());
		
driver.findElement(By.name(pr.getProperty("pwd"))).
                                          sendKeys(r.getCell(1).getStringCellValue());
		
		driver.findElement(By.name(pr.getProperty("singIn"))).click();
		
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
		
		FileOutputStream file1 = new FileOutputStream("./src/com/ApplicationTetResultFiles/NewTours_LogInTestResult_KeyWord.xlsx");
		workBook.write(file1);
		
		driver.navigate().back();
		
	}
	
	}
}
