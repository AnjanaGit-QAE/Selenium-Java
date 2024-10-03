package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicCheckboxes {

	public static void main(String[] args) {
    
      //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
		
      WebDriver driver=new ChromeDriver();
      driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
      driver.manage().window().maximize();
      
      //xpath syntax ---> //tagname[@name of attribute='value of attribute'] 
      
      String DesiredOutput="Indian Armed Forces";
      List<WebElement> check =  driver.findElements(By.xpath("//input[@type='checkbox']//parent::div"));  // parent traversal -->  //div[@id='ctl00_mainContent_IndArm']//child::label/following-sibling::as
      int len=check.size(); 
      System.out.println(len);
      
      for(int i=1;i<len;i++) {
    	  System.out.println(check.get(i).getText());
    	  if(check.get(i).getText().equals(DesiredOutput)) {
    		  check.get(i).click();
    	  }
      }
      
      //driver.close();
	}
    
}
