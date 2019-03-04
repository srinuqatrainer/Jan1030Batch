package com.OHRM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OHRM_LogInTest_TestData {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = null;
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
			
		driver = new FirefoxDriver();
		driver.get(url);
		
		FileInputStream file = new FileInputStream("./src/com/OHRM_TestDataFiles/OHRM_LogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		Row r=sheet.getRow(1);
		
		// <input name="txtUsername" id="txtUsername" type="text">
		
		driver.findElement(By.id("txtUsername")).sendKeys(r.getCell(0).getStringCellValue());
		
		// <input name="txtPassword" id="txtPassword" type="password">
		driver.findElement(By.name("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
		
		// <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		driver.findElement(By.id("btnLogin")).click();
		
		String expected_LogInText="Welcome";
		System.out.println("The exptected text after successfull logIn is : "+expected_LogInText);
		
		WebElement actual_LogInTextElement=driver.findElement(By.id("welcome"));
		String actual_LogInText=actual_LogInTextElement.getText();
		
		System.out.println(" the actual text after logIn is : "+actual_LogInText);
		
		if(actual_LogInText.contains(expected_LogInText))
		{
			System.out.println("LogIn Successfull - PASS");
			r.createCell(2).setCellValue("LogIn Successfull - PASS");
		}
		else
		{
			System.out.println("LogIn Failed - FAIL");
			r.createCell(2).setCellValue("LogIn Failed - FAIL");
		}
		
		FileOutputStream file1 = new FileOutputStream("./src/com/OHRM_TestResultFiles/OHRM_TestResult.xlsx");
		workBook.write(file1);
		
		actual_LogInTextElement.click();
		
		driver.findElement(By.linkText("Logout")).click();
		
		driver.quit();
	
	}

}
