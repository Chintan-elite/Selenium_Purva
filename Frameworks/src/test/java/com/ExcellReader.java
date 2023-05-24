package com;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReader {

	String path;
	String sheet;
	
	
	public ExcellReader(String path, String sheet) {
		super();
		this.path = path;
		this.sheet = sheet;
	}

	public int rowCount()
	{
		int i =0;
		try {
			XSSFWorkbook workBook = new XSSFWorkbook(path);
			XSSFSheet  workSheet = workBook.getSheet(sheet);
			i = workSheet.getPhysicalNumberOfRows();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return i;
	}
	
	public int colCount()
	{
		int i=0;
		try {
			XSSFWorkbook workBook = new XSSFWorkbook(path);
			XSSFSheet  workSheet = workBook.getSheet(sheet);
			 i = workSheet.getRow(0).getPhysicalNumberOfCells();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return i;
	}
	
	public String getData(int row, int col)
	{
		String data = null;
		
		try {
			XSSFWorkbook workBook = new XSSFWorkbook(path);
			XSSFSheet  workSheet = workBook.getSheet(sheet);
			 data = workSheet.getRow(row).getCell(col).getStringCellValue();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
		return data;
	}
	
}
