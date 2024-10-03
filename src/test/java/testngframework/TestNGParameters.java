package testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
	// In XML File
	
	// <test>
	// <parameter name="Browser" value="Edge"></parameter> 
	// </test>
	// <class name="testngframework.TestNGParameters"/>
	
    public WebDriver driver;
    
	@Parameters("Browser")  
	@Test
	public void browserInvoking(String name) throws InterruptedException {
		
		if(name.equals("Chrome")) {
		    
	        driver = new ChromeDriver();
		}
		
		else if (name.equals("Edge")) {	
			
	        driver = new EdgeDriver();
		}
		
		else {
			
	        driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://en.wikipedia.org/wiki/List_of_most-visited_websites");
	    Thread.sleep(2000);
	    
	    driver.close();
	}
}
