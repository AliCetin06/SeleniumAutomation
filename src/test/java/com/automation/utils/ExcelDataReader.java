package com.automation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void initExcelData() throws Exception {
		InputStream input = new FileInputStream("/Users/alicetin/Desktop/eclipse/CucumberAutomation/src/test/resources/data/TestData.xlsx");
	 workbook = new XSSFWorkbook(input);
		sheet = workbook.getSheetAt(0);
	}
	
	public static String getData(int rowNumber , int columnNumber) {
		XSSFRow row = sheet.getRow(rowNumber);  // choosing row number
		 return row.getCell(columnNumber).getStringCellValue();
	}
	
	public static int getTotalRow() {
		return sheet.getPhysicalNumberOfRows();
	}
	
public static  int getTotalColumn() {
	return sheet.getRow(0).getPhysicalNumberOfCells();
		
	}

}
