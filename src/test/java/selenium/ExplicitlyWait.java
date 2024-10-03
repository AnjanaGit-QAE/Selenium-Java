package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
		
        WebDriver driver=new ChromeDriver();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		WebElement button = driver.findElement(By.id("populate-text"));
		
		button.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Selenium Webdriver')]")));
		
		// General xpath synatx is : //tagname[@attributename = 'attribute value'] type,id,classname, name 
		
		// xpath synatx for Black Colour Text is : //tagname[contains(text(),'VisibleText in black colour')]
		//Ex: //h2[contains(text(),'Selenium Webdriver')]
		
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Selenium Webdriver')]"));
		
		boolean b = text.isDisplayed();
		
		
		if(b == true)
		{
			System.out.println("Yes! Element is displaying");
		}
		else
		{
			System.out.println("No! Element is not displaying");
		}
		
		/*
		 * WebElement button1= driver.findElement(By.id("checkbox")); button1.click();
		 * 
		 * WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//input[type='checkbox']parent::p"))); String desiredcheckbox="checkbox";
		 */
		
		
	}

}
