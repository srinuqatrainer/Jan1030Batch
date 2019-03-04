package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadOpeations_SingleTestData {

	public static void main(String[] args) throws IOException {
		
		// Identifying the file in the Project
		// FileInputStream is a class in Java for identifying a file in the system 
FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");

	// XSSFWorkbook class in Apache poi used to identify the workbook in a file
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
		// XSSFSheet is a class in Apache poi used to identify the Sheet in the workBook
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// going to the sheet and identifying a Row
		Row r=sheet.getRow(0);
		// going to a Row and identifying the cell 
		Cell c=r.getCell(0);
		
		// Going to a Row of a cell to get a string Value
		String data=c.getStringCellValue();
		// Printing the Value 
		System.out.println(data);
		
	}

}
