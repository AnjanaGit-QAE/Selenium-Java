package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/");
		
		WebElement link = driver.findElement(By.linkText("JavaScript Alerts"));
		link.click();
		Thread.sleep(3000);
		
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		button.click();
		Thread.sleep(3000);

		// Verification/Normal Pop up// Browser Based popup's
		Alert A = driver.switchTo().alert(); // this is the line to switch into the pop up
		// A.accept();
		A.dismiss();
		Thread.sleep(3000);

		
	    WebElement button1=driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")); 
	    button1.click();
	    Thread.sleep(3000);
	    
		Alert A1=driver.switchTo().alert(); 
		
	    A1.sendKeys("Anjana");
	    Thread.sleep(3000);
	    
		A1.accept();
		Thread.sleep(3000);
		
		driver.close();
		 
		// driver.navigate().back();
	}

}
