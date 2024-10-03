package testngframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicTableHandling {

	@Test
	public  void TableHandling() throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html?m=1");
		
		List<WebElement> Head = driver.findElements(By.xpath("//table[@id='customers']//tr/th"));
		System.out.println(Head.size());
		
		for(WebElement ele : Head )
		{
			String Value = ele.getText();
			System.out.println(Value);

		}
		
		System.out.println();
		
		List<WebElement> coloumns = driver.findElements(By.xpath("//table[@id='customers']//th"));
		
		Assert.assertEquals(coloumns.size(), 5,"Coloumns are Matched");
		
		boolean status = false; 
		for(WebElement ele : coloumns )
		{
			String Value = ele.getText();
			System.out.println(Value);
			
			if(Value.equals("Country"))
			{
				status = true;
				break;
				
			}
		}
		
		Assert.assertTrue(status, "Coloum didn't found");
		
		System.out.println();
		
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println(tableRows.size());
		
		Assert.assertEquals(tableRows.size(), 7,"Table Rows didn't matched");
		
		System.out.println();
		
		
		List<WebElement> tableData = driver.findElements(By.xpath("//table[@id='customers']//td"));
		System.out.println(tableData.size());
		
		for(WebElement ele : tableData )
		{
			String Value = ele.getText();
			System.out.println(Value);

		}
		
		System.out.println();
		
		List<WebElement> tableDataCheck = driver.findElements(By.xpath("//table[@id='customers']//td"));
		System.out.println(tableDataCheck.size());
		
		boolean dataStatus = false;
		for(WebElement ele : tableDataCheck )
		{
			String Value = ele.getText();
			System.out.println(Value);
			
			if(Value.equals("Jenkins"))
			{
				dataStatus=true;
				break;
			}

		}
		
		Assert.assertTrue(dataStatus, "Record didn't match");
		
		System.out.println();
		
		List<WebElement> secondRowData = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		System.out.println(secondRowData.size());
		
		for(WebElement ele : secondRowData )
		{
			String Value = ele.getText();
			System.out.println(Value);

		}
		
		System.out.println();
		
		List<WebElement> CompanyData = driver.findElements(By.xpath("//table[@id='customers']//tr/td[2]"));
		System.out.println(CompanyData.size());
		
		boolean companyStatus = false;
		for(WebElement ele : CompanyData )
		{
			String Value = ele.getText();
			System.out.println(Value);
			
			if(Value.equals("Amazon")) //Amzon
			{
				companyStatus=true;
				break;
			}

		}
		
		Assert.assertTrue(companyStatus, "Company didn't Found");

		WebElement checkboxClick = driver.findElement(By.xpath("//td[text()='Selenium']/preceding-sibling::td/input"));
		checkboxClick.click();
		Thread.sleep(3000);
		
		WebElement linkClick = driver.findElement(By.xpath("//td[text()='Ola']/following-sibling::td[3]/a"));
		linkClick.click();
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}

//table[@id='customers']
//table[contains(@id,'cust')]


//td[text()='Selenium']
//td[contains(text(),'Selenium')]
//td[contains(text(),'Sel')]
