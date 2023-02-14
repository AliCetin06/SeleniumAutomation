package com.automation.class2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.automation.utils.ExcelDataReader;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {

		InputStream input = new FileInputStream(
				"/Users/alicetin/Desktop/eclipse/TestNGAutomation/src/test/resources/data/TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(input);

		XSSFSheet sheet = workbook.getSheetAt(0); // choosing sheet number
		XSSFRow row = sheet.getRow(1); // choosing row number
		XSSFCell column1 = row.getCell(0); // choosing column number
		XSSFCell column2 = row.getCell(1); // choosing column number
		String userName = column1.getStringCellValue(); // getting the username value
		String password = column2.getStringCellValue(); // getting the username value

		System.out.println(sheet.getPhysicalNumberOfRows()); // getting how many rows have a data
		System.out.println(row.getPhysicalNumberOfCells()); // getting how many colum have a data
		System.out.println(userName);
		System.out.println(password);

		// 2. way from utils package ExcelReader.java
		ExcelDataReader.initExcelData();
		System.out.println(ExcelDataReader.getData(1, 1));

		// how to get all data from excel file
		ExcelDataReader.initExcelData();
		for (int i = 0; i < ExcelDataReader.getTotalRow(); i++) {
			for (int j = 0; j < ExcelDataReader.getTotalColumn(); j++) {
				System.out.print(ExcelDataReader.getData(i, j) + " ");

			}
			System.out.println();

		}

	}

}
