package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\msedgedriver.exe");
	  
		WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    
	    WebElement search= driver.findElement(By.id("autosuggest"));
	    search.sendKeys("Ban");
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Bangladesh')]")));
		
	    WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Bangladesh')]"));   
	    element.click();
	   
	    
	}

}
