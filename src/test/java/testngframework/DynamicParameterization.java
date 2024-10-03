package testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DynamicParameterization {
	
	@Test (dataProvider="Get data From Array")
	public void Parameterization(String UN , String Pwd) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.get("https://www.naukri.com/");
        
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(2000);
        
        WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
        Username.sendKeys(UN);
        
        WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
        Password.sendKeys(Pwd);
        
        Thread.sleep(2000);
        driver.close();
       
	}
	
	@DataProvider(name="Get data From Array")
	public Object[][] getUserData() {
		
		// Two Dimensional Array
		// Object Datatype -->  "Object[][]"
		// Array of Object.
		// Object[][] Array.
		// Retun Type is "Object[][]"
		
		Object[][] arr = new Object[][] {{"anjana@gmail.com","9182045334"},{"Sharanya@gmail.com","8520030547"},{"raja@gmail.com","9493598976"}};
		return arr;
		
	}
}
