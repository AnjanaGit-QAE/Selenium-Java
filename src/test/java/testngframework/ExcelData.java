package testngframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelData {
    
	@Test
	public void ExcelData() throws IOException  {
		
		File f=new File("C:\\Users\\Anjana Raja\\Documents\\Anjana\\Notes\\Execl Automation Data.xlsx");  //bringing the excel sheet inside the test
		
		FileInputStream input = new FileInputStream(f);   //making connection with excelsheet
		
		XSSFWorkbook WB = new XSSFWorkbook(input);  //interacting with the excel workboox
		
		XSSFSheet sheet = WB.getSheet("Register");  //getting the sheet
		
		XSSFRow row = sheet.getRow(0);
		
		int rowcount= sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		
		int coloumncount= row.getLastCellNum();
		System.out.println(coloumncount);
		
		
		  for(int i=0;i<rowcount-1;i++) {
			row=sheet.getRow(i+1);
			  
			  for(int j=0;j<coloumncount;j++) { 
				  System.out.println(row.getCell(j)); 
				  
			  }
		  
		  }
		 
  }

}