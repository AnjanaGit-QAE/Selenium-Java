package com.readwriteexceloperations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteInExcel {

	public static void main(String[] args)  {
		
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Details");
		
		XSSFRow row = sheet.createRow(0); // first row
	    
		XSSFCell cell = row.createCell(0); //first row first cell
	    cell.setCellValue("Raja");
	    
	    cell = row.createCell(1);
	    cell.setCellValue("Anjana");
	    
	    cell = row.createCell(2);
	    cell.setCellValue("Sharanya");
	    
	    cell=row.createCell(3);
	    cell.setCellValue("Dhone");
	    
	    row= sheet.createRow(1); //second row
	    
	    cell=row.createCell(0);
	    cell.setCellValue("Raja");
	    
	    cell=row.createCell(1);
	    cell.setCellValue("Lavanya");
	    
	    cell = row.createCell(2);
	    cell.setCellValue("Anji");
	    
	    cell=row.createCell(3);
	    cell.setCellValue("Dhone Town");
	    
	    
	    try {
	    	
			FileOutputStream fio = new FileOutputStream("My Details.xlsx");
			wb.write(fio);
			wb.close();
		} 
	    
	    catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	    
	    catch (IOException e) {
			
			e.printStackTrace();
		}
	    

	}

}
