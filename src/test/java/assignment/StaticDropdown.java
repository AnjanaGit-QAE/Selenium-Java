package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://amazon.in"); 
	    driver.manage().window().maximize();
	    
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
        
        Select s=new Select(dropdown);
        s.selectByIndex(7);
        Thread.sleep(3000);
        
        s.selectByValue("search-alias=amazon-pharmacy");
        Thread.sleep(3000);
        
        s.selectByVisibleText("Electronics");
        Thread.sleep(3000);
       
       // driver.close();
	}

}
