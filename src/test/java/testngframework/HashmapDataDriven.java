package testngframework;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HashmapDataDriven {
	
	@Test(dataProvider="lucky")
	public void HashMapData(HashMap<String,String> testdata) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		
		WebElement Register = driver.findElement(By.id("register_Layer"));
		Register.click();
		Thread.sleep(3000);
		
		WebElement FullName = driver.findElement(By.id("name"));
		FullName.sendKeys(testdata.get("Name"));
		Thread.sleep(3000);
		
		WebElement Email = driver.findElement(By.id("email"));
		Email.sendKeys(testdata.get("Email"));
		Thread.sleep(3000);
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(testdata.get("Pwd"));
		Thread.sleep(3000);
		
		WebElement MobileNumber = driver.findElement(By.id("mobile"));
		MobileNumber.sendKeys(testdata.get("Mblno"));
		Thread.sleep(3000);
		
		driver.close();
	
	}
	
	@DataProvider(name="lucky")
	public Object[][] getData() {
		
		HashMap<String,String> anju = new HashMap<String,String> ();
		anju.put("Name", "Anjana");
		anju.put("Email", "anju@gmail.com");
		anju.put("Pwd", "Anju@1205");
		anju.put("Mblno", "9876543210");
		
		HashMap<String,String> sharru = new HashMap();
		sharru.put("Name", "Sharanya");
		sharru.put("Email", "sharru@gmail.com");
		sharru.put("Pwd", "Sharanya@1205");
		sharru.put("Mblno", "9876543210");
		
		HashMap<String,String> raja = new HashMap();
		raja.put("Name", "Raja");
		raja.put("Email", "raja@gmail.com");
		raja.put("Pwd", "Raja@1205");
		raja.put("Mblno", "9876543210");
		
		return new Object[][] {{anju},{raja},{sharru}};
	}

}
