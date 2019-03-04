package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteOpeation {

	public static void main(String[] args) throws IOException {
		// Identifying the file in the Project
		// FileInputStream is a class in Java for identifying a file in the system 
FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");

	// XSSFWorkbook class in Apache poi used to identify the workbook in a file
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
		// XSSFSheet is a class in Apache poi used to identify the Sheet in the workBook
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// creating the Row in the Sheet
		Row r=sheet.createRow(2);
		
		// creating a Cell in the ROW
		Cell c=r.createCell(3);
		
		// setting a value into the Row Of a Cell
		c.setCellValue("LiveTech");
		
		FileOutputStream file1 = new FileOutputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		workBook.write(file1);


	}

}
