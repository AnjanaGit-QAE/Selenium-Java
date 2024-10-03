package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutenticationPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	  
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
	    driver.get("https://the-internet.herokuapp.com/");
	    Thread.sleep(3000);
	    
	    WebElement link=driver.findElement(By.linkText("Basic Auth"));
	    link.click();
	    Thread.sleep(3000);
	    
	    String Username="admin";
	    String Password="admin";
	    
	    String URL="https://" + Username +":"+ Password +"@"+"the-internet.herokuapp.com/basic_auth";
	    Thread.sleep(3000);
	    
	    driver.get(URL);
	    Thread.sleep(5000);
	    
	    driver.close();
	}

}
