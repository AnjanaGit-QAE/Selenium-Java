package selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    
	    WebElement search = driver.findElement(By.id("autosuggest"));
	    search.sendKeys("sou");
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'South Africa')]")));
		
	    WebElement element=driver.findElement(By.xpath("//a[contains(text(),'South Africa')]"));   
	    element.click();
	    Thread.sleep(2000);
	    
	    driver.close();
	    
	}

}
