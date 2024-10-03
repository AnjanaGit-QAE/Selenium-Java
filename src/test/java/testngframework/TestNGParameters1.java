package testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters1 {
	
	// In XML File
	
	// <test>
	// <parameter name = "Username" value = "anjuraja1205@gmail.com"> </parameter>
    // <parameter name = "Password" value = "Anjana@12051999"> </parameter>
	// </test>
	
    // <class name="testngframework.TestNGParameters1"/>
	
	@Parameters({"Username","Password"}) 
	@Test
	public void Parameterization(String UN , String Pwd) throws InterruptedException {
		
		
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
	
}
