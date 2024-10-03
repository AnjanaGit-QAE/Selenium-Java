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
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class TestNGSyntaxs {
    
	public WebDriver driver;
	
	// TestNG Features --> No need of XML File Changes
	
	// 1. Giving Priority to Testcases.
	 @Test (priority=1)
	 public void Testcasename() {
		 driver.close();
	 }
	 
	// 2.Exculding Testcase for execution.
	 @Test (enabled=false)
	 public void Testcasename1() {
		 driver.close();
	 }
	 
	// 3.Execution of testcases at 'N' times.
	 @Test (invocationCount=10)
	 public void Testcasename2() {
		 driver.close();
	 }
	 
	// 4.Skipping  Testcases.
	@Test 
	public void Testcasename3() {
		
		driver.close();
		throw new SkipException("This testcase is skipped");
		
	}
	
	// Data Driven
	@Test (dataProvider = "magicman")
	public void Testcase4(String s1, String s2) {
		
	}
	
	@DataProvider(name="magicman")
	public Object[][] getUserData() {
		
		Object[][] arr = new Object[][] {{"anjana@gmail.com","9182045334"},{"Sharanya@gmail.com","8520030547"},{"raja@gmail.com","9493598976"}};
		return arr;
		
	}
	
	//  Assertions

    // Two types of Assertions.
    public void Testcase5() {
	boolean ExpectedResult= false;
    
    WebElement Register = driver.findElement(By.id("register_Layer"));
    boolean Result = Register.isDisplayed(); // true
    
    // 1. Hard Assert or Assert
    // *** Display Message in Console Window and If Assert(Hard) got fail.It will Stop Execution and It won't proceed with Next steps of Execution Testcase Will fail.
    
    Assertion Assert= new Assertion(); // (Syntax) This is not Mandatory 
    Assert.assertTrue(Result == ExpectedResult, "The Element is Not Visible");
    
    //2. Soft Assert or Verify
    //If Assert got fail also. It won't Stop Execution It will proceed with Next steps.
    
    SoftAssert SA =new SoftAssert(); 
    SA.assertTrue(Result == ExpectedResult, "The Element is Not Visible");
    
    SA.assertAll();
    
   }
    
	// In XML File Changes 
	
    // Executing Group of Testcases
    
    //In XML File
	//Groups of testcases which we want to execute particularly instead of running every testcases.
    
	   /* <test>
	    * <groups> 
	    * <run> 
	    * <include name="Raja"/> 
	    * <exclude name="Raja"/> 
	    * </run>
	    * </groups> 
	    * </test>
	    */
    
	// <class name="testngframework.TestcaseGroupUsingXML"/>
    
    @Test (groups="Anjana")
	 public void Testcasename6() {
		 driver.close();
	 }
    
    @Test (groups="Anjana")
	 public void Testcasename7() {
		 driver.close();
	 }
   
	// Parallel Execution
    
    // 1. Classes --> Classes will be Parallely executed in two different browser windows.
    
    // In XML file
    // <suite name="GroupsPracticeSuite" parallel="classes" >
    
    // <class name="testngframework.TestNGParallelExecutionOfClasses"/>
    // <class name="testngframework.TestNGParameters1"/> 
     @Test 
	 public void Testcasename8() {
		 driver.close();
	 }
    
	
    // 2. Methods --> methods/testcases inside the class will be executed parallely in different windows.
    
    // In XML file
    // <suite name="GroupsPracticeSuite" parallel="methods" >
    
    // <class name="testngframework.TestNGParallelExecutionOfmethods"/>
    
     @Test 
	 public void Testcasename9() {
		 driver.close();
	 }
     
     @Test 
	 public void Testcasename10() {
		 driver.close();
	 }
     
     // Parameters Pssing 
     
     // In XML File
     
     // <test>
 	 // <parameter name="Username" value="anjuraja1205@gmail.com"></parameter>
     // <parameter name="Password" value="Anjana212051999"></parameter>
     //</test>
     
     // <class name="testngframework.TestNGParameters1"/>
 	
 	 @Parameters({"Username","Password"}) 
 	 @Test
 	 public void Parameterization(String UN , String Pwd) {
 		// actions
 	 }
 	 
 	 // Data Driven From Excel Sheet
 	 
 	  public Object[][] getData() throws IOException
	  {
		DataFormatter D = new DataFormatter();
		
        File f=new File("C:\\Users\\Anjana Raja\\Documents\\Anjana\\Notes\\Execl Automation Data.xlsx");  //bringing the excel sheet inside the test
		
		FileInputStream FIS = new FileInputStream(f);   //making connection with excelsheet
		
		XSSFWorkbook WB = new XSSFWorkbook(FIS);  //interacting with the excel workboox
		
		XSSFSheet sheet = WB.getSheet("Register");  //getting the sheet
		
		XSSFRow row = sheet.getRow(0);
		
		int rowcount = sheet.getPhysicalNumberOfRows();//4
		
		System.out.println(rowcount);
		
		int columncount = row.getLastCellNum();//4 
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
