package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesHandling2 {

	public static void main(String[] args) {
		

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		//Demo WebTable 1 (Static Table)
		
		
		//Fetching Table Head will also be consider as Row1 [Static Table]
		WebElement RowFetching  = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]"));
		System.out.println(RowFetching.getText());
		
		//Fetching Sixth Row Data.
		System.out.println();
		System.out.println("Sixth Row Data : ");
		
		WebElement RowDta = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[6]"));
		System.out.println(RowDta.getText());
		System.out.println();
		
    	List<WebElement> RowData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[6]/td"));
		int len = RowData.size();
		
		for(int i=0;i<len;i++) {
			System.out.println(RowData.get(i).getText()); 
		}
		
		//Fetching Entire table  Row Data i.e  Third Column Data
		System.out.println();
		System.out.println("Entire table Row Data i.e Third Coloum Data ");

		List<WebElement> ColoumData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		int len1=ColoumData.size();
		
		for(int i=0;i<len1;i++) {
			System.out.println(ColoumData.get(i).getText()); 
		}
		
		//Fetching Entire Table Data
		System.out.println();
		System.out.println("Entire Table Data : ");
		System.out.println();
		
		List<WebElement> TableData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int len2=TableData.size();
		for(int i=0;i<len2;i++) {
			System.out.println( TableData.get(i).getText());
		}
		
		
		//Demo WebTable 2 (Dynamic Table)
		
		//Fetching Table Row Head
		System.out.println();
		System.out.println("Table Row Head : ");
        
		WebElement TableHed = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/thead"));
		System.out.println(TableHed.getText());
		System.out.println();
		
		List<WebElement> TableHead=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead"));
		int len3=TableHead.size();
		
		for(int i=0;i<len3;i++) {
			System.out.println( TableHead.get(i).getText());
		}
		
		//Fetching Fourth Row Head
		System.out.println();
		System.out.println("Fourth Row Head : ");

		WebElement RowHead = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[4]/th"));
		System.out.println(RowHead.getText());
		
		//Fetching Second Row Head
		System.out.println();
		System.out.println("Second Row Head : ");

		WebElement rowhead= driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[2]/th"));
		System.out.println(rowhead.getText());
		
		//Fetching Third Row Data
		System.out.println();
		System.out.println("Third Row Data : ");

		List<WebElement> Rowdata= driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[3]/td"));
		int len4=Rowdata.size();
		
		for(int i=0;i<len4;i++) {
			System.out.println( Rowdata.get(i).getText());
		}
		
		//Fetching Fifth Column Data
		System.out.println();
		System.out.println("Fetching Fifth Coloum Data : ");

		List<WebElement> FifthColData = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[5]"));
		int len5=FifthColData.size();
		
		for(int i=0;i<len5;i++) {
			System.out.println( FifthColData.get(i).getText());
		}
		
		
		//Fetching Foot Elements in a Table
		System.out.println();
		System.out.println("Fetching Foot Element1 in a Table : ");
		WebElement FootElement1 = driver.findElement(By.xpath("//tfoot[@style='margin:0;padding:0']/tr/th"));
		System.out.println(FootElement1.getText());
		
		//Fetching Foot Element in a Table
		System.out.println();
		System.out.println("Fetching Foot Element2 in a Table : ");
		WebElement FootElement2 = driver.findElement(By.xpath("//tfoot[@style='margin:0;padding:0']/tr/td"));
		System.out.println(FootElement2.getText());
		
		
		//Fetching Fourth Column Data Sum
		System.out.println();
		
		System.out.println("Fetching Fourth Coloum Data Sum : ");
		int ExpectedTotal = 8034;
		int ActualTotal=0;
		
		List<WebElement> ColoumSum = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[4]"));
		int len6=ColoumSum.size();
		
		for(int i=0;i<len6;i++) {
			
			String S1=ColoumSum.get(i).getText();
			int I = Integer.parseInt(S1);
			ActualTotal = ActualTotal + I;
			
		}
		System.out.println("Actual Total is : " +ActualTotal) ;
		
		if(ExpectedTotal == ActualTotal) {
			System.out.println("Yes!! Total Matched Successfully : " +ActualTotal);
		}
		else {
			System.out.println("No!! Total Not Matched  : " +ActualTotal);
		}
			
	}

}
