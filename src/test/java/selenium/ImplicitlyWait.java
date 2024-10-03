package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
	    
	    // Implicitly wait time is applicable for all web elements
	    // it won't throw any Exception untill and unless wait time is over. i.e : NoSuchElementException
	    // if the element is found within the mentioned time or lessthan mentioned time, it wont wait upto mentioned time completion, it will proceed with the next step execution.
	    
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	    
	    driver.get("https://naveenautomationlabs.com/opencart/"); 
	    driver.manage().window().maximize();
	    
	    // It wait upto 5 seconds.
	    //If element is found or not found it will wait upto  wait time is completed, It won't proceed to next step for Execution.
	    
	    Thread.sleep(10000); 
	    
	    WebElement link=driver.findElement(By.linkText("Apple Cinema 30\""));
        link.click();
        Thread.sleep(2000);
        
        driver.close();
	}
	

}
