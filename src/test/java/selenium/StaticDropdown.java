package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		
     //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
     
	  WebDriver driver = new ChromeDriver();
      driver.get("https://naveenautomationlabs.com/opencart/");
      driver.manage().window().maximize();
      
      WebElement lt=driver.findElement(By.linkText("Apple Cinema 30\""));
      lt.click();
      
      WebElement dropdown=driver.findElement(By.id("input-option217"));
      
      Select s = new Select(dropdown);
      
        // Printings list og options in a dropdown
	     List<WebElement> opts = s.getOptions();
	     
	     for(WebElement op : opts ) {
	    	 System.out.println("Options in an Select Dropdown is :" + op.getText());
	     }
	     
     
      s.selectByIndex(3); // index starts from "0"
      Thread.sleep(3000);
      
      s.selectByValue("3");
      Thread.sleep(3000);

     //s.selectByVisibleText("Green\r\n"+"(+$1.20)\r\n"+"");
     
      driver.close();
	
	}

}


