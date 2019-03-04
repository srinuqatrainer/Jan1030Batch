package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadOperations_MultipleTestData {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/MultipleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// In the sheet identifying the total number of active rows with data
		int rowCount=sheet.getLastRowNum();
		
		for(int i=0;i<=rowCount;i++) // goes to every Row
		{
			// goes to every row of the Sheet
			Row r=sheet.getRow(i);
			
			// In the Row identifying the active cells with data
			int cellCount=r.getLastCellNum();
			
			for(int k=0;k<cellCount;k++) // Goes to every Row of all Cells
			{
				// Of every Row - get the data from all the active cells
				String data=r.getCell(k).getStringCellValue();
				
				// printing the data 
				System.out.print(data+" ");
			}
			// will take to next Row
			System.out.println();
			
		}

	}

}
