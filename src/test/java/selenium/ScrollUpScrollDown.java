package selenium;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrollUpScrollDown {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
        driver.get("https://in.bookmyshow.com/");
		
		WebElement cityselection = driver.findElement(By.xpath("//span[contains(text(),'Bengaluru')]"));
		cityselection.click();
		
		Thread.sleep(3000);
		
        JavascriptExecutor JE = (JavascriptExecutor)driver;
		
		JE.executeScript("window.scrollBy(0,6000)"); //Scroll Down +ve Values.
		
		Thread.sleep(3000);
		
		JE.executeScript("window.scrollBy(0,-6000)"); //Scroll up -ve Values.
		
		Thread.sleep(3000);
		
		WebElement desiredlink = driver.findElement(By.xpath("//div[contains(text(),'24/7 CUSTOMER CARE')]"));
		
		JE.executeScript("arguments[0].scrollIntoView(true);", desiredlink);
	
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    Files.copy(f, new File("C:\\Users\\Anjana Raja\\Documents\\Anjana\\Selenium\\Images\\screenshot.png"));

	}

}



