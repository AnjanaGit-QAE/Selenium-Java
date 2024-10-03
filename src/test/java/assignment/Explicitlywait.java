package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitlywait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().window().maximize();
        WebElement button= driver.findElement(By.id("display-other-button"));
        button.click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hidden")));
		
		WebElement button1=driver.findElement(By.id("hidden"));
		boolean b=button1.isEnabled();
		if(b==true) {
			System.out.println("Yes! Button Enabled");
			button1.click();
		}
		else {
			System.out.println("No! Button is Disabled");
		}
		
		// Another valition for other button
		
		WebElement button2= driver.findElement(By.id("checkbox"));
        button2.click();
        
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@type='checkbox']")));
		
		
		
	}

}
