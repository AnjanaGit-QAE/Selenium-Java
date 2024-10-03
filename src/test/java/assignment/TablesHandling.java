package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	   
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://the-internet.herokuapp.com/tables");
		
		// Table 1 Static Table
		
		//Fetching Table Head
		System.out.println("Fetiching Table Head : ");
		WebElement TableHead= driver.findElement(By.xpath("//table[@id='table1']/thead"));
		System.out.println(TableHead.getText());
		
		//Fetching Fourth Row Data
		System.out.println();
		System.out.println("Fetiching Row Data : ");

		List<WebElement> Rowdata= driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[4]"));
		int len=Rowdata.size();
		
		for(int i=0;i<len;i++) {
		     System.out.println(Rowdata.get(i).getText());
		}
		
		//Fetching Column Data
		
		System.out.println();
		System.out.println("Fetiching Coloum Data : ");

		List<WebElement> ColoumData= driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[4]"));
		int len1=ColoumData.size();
		
		for(int i=0;i<len1;i++) {
		     System.out.println(ColoumData.get(i).getText());
		}
		
		//Fetching Particular Element
		
		System.out.println();
		System.out.println("Fetiching Particular Data : ");

		WebElement ElementData= driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[3]"));
		System.out.println(ElementData.getText());
		
		
		// Table 2 Static Table
		
	    //Fetching Table Head
		System.out.println();
		System.out.println("Fetiching Table Head : ");
		WebElement Tablehead= driver.findElement(By.xpath("//table[@id='table2']/thead"));
		System.out.println(Tablehead.getText());
		
		//Fetching Third Row Data
		System.out.println();
		System.out.println("Fetiching Row Data : ");
	
		List<WebElement> RowData= driver.findElements(By.xpath("//table[@id='table2']/tbody/tr[3]"));
		int len3=RowData.size();
				
		for(int i=0;i<len3;i++) {
		    System.out.println(RowData.get(i).getText());
		}
		

		//Fetching Column Row Data
		System.out.println();
		System.out.println("Fetiching Coloum Data : ");
		System.out.println();
						
		List<WebElement> Coloumdata= driver.findElements(By.xpath("//table[@id='table2']/tbody/tr/td[5]"));
		int len4=Coloumdata.size();
						
		for(int i=0;i<len4;i++) {
			 System.out.println(Coloumdata.get(i).getText());
		}
		
		//Fetching Particular Element
		
		System.out.println();
		System.out.println("Fetiching Particular Data : ");

		WebElement Elementdata= driver.findElement(By.xpath("//table[@id='table2']/tbody/tr[4]/td[6]"));
		System.out.println(Elementdata.getText());
				
		
		
		
				
		
		
	}

}
