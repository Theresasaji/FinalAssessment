package com.employee.Utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	
	public static XSSFWorkbook excelWBook;
	public static XSSFSheet excelWsheet;
	public static XSSFCell cell;
	public static XSSFCell getCellData(int row,int column) throws IOException 
	{
			
			FileInputStream File = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\Employee.xlsx");
			excelWBook=new XSSFWorkbook(File);
			excelWsheet=excelWBook.getSheetAt(0);
			cell=excelWsheet.getRow(row).getCell(column);
			return cell;
	}

}
