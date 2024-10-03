package testngframework;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenFromExcelSheet {
	
	@Test(dataProvider="getData")
	public void testcase1(String fullname, String emailid, String password, String mobilenumber) throws InterruptedException
	{
		
		 
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.manage().deleteAllCookies();
	     
	     driver.get("https://www.naukri.com/");
	     
		 WebElement registerlink = driver.findElement(By.linkText("Register"));
		 Thread.sleep(3000); 
		 registerlink.click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("name")).sendKeys(fullname);
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("email")).sendKeys(emailid);
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("password")).sendKeys(password);
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("mobile")).sendKeys(mobilenumber);
		 
		 Thread.sleep(3000);
		 
		 
		 driver.close();
	}
	
	
	@DataProvider
	public Object[][] getData() throws IOException
	{
		DataFormatter D = new DataFormatter();
		
        File f=new File("C:\\Users\\Anjana Raja\\Documents\\Anjana\\Notes\\Execl Automation Data.xlsx");  //bringing the excel sheet inside the test
		
		FileInputStream input = new FileInputStream(f);   //making connection with excelsheet
		
		XSSFWorkbook WB = new XSSFWorkbook(input);  //interacting with the excel workboox
		
		XSSFSheet sheet = WB.getSheet("Register");  //getting the sheet
		
		XSSFRow row = sheet.getRow(0);
		
		int rowcount = sheet.getPhysicalNumberOfRows();//4
		System.out.println(rowcount);
		
		int columncount = row.getLastCellNum(); //4  row.getPhysicalNumberOfCells()
		System.out.println(columncount);
		
		Object [][] testvalues = new Object[rowcount-1][columncount];  
		
		// It declares a two-dimensional array of type Object. 
		//This means each element in the array can hold any type of object.

		for (int i = 0; i<rowcount-1; i++) // for iterating the rows // 1 2 3
		{
			row = sheet.getRow(i+1);
			for (int j = 0; j<columncount ; j++) //0 1 2 3
			{
				XSSFCell cell = row.getCell(j);//9629850709
				testvalues [i][j] = D.formatCellValue(cell);//"9629850709"
			}
				
		}
		
		return testvalues;
	}

}
