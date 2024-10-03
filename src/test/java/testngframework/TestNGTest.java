package testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGTest {
  
	@Test
	public void testcase1() throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	   
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
	    driver.get("https://www.rapido.bike/");
	    
	    WebElement Home= driver.findElement(By.xpath("(//a[contains(text(),'Home')])[1]"));
	    Home.click();
	    Thread.sleep(3000);
	    
	    WebElement AboutUs = driver.findElement(By.xpath("(//a[contains(text(),'About Us')])[1]"));
	    AboutUs.click();
	    Thread.sleep(3000);
	    
	    driver.close();
	    
	}
	
	@Test
	public void testcase2() throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	   
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
	    driver.get("https://www.jiomart.com/");
	    
	    WebElement SignIn = driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
	    SignIn.click();
	    Thread.sleep(3000);

	    driver.close();
	    
	    
	}
}
