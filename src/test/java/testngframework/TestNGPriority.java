package testngframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGPriority{  // Execution Order -2,-2,0,No priority,1,2,3....
	
    @Test(priority=3)
	public void bookMyShow() throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	   
    	WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
		driver.get("https://ticketnew.com/movies");
		Thread.sleep(2000);
		
		driver.close();
		
	}
    
	
    @Test(priority=2)
	public void ajioStore() throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	    
    	WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		
		driver.close();
	}
    
	
    @Test(priority = -1)
	public void shoppingKart() throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	    
    	WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
		driver.get("https://shoppingkartonline.in/");
		Thread.sleep(2000);
		
		driver.close();
	}
    
    @Test(priority = 0)
	public void Rapido() throws InterruptedException {
		
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
    
	
	@Test(priority=1)
	public void JioMart() throws InterruptedException {
		
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
	
	@Test(priority=-2)
	public void Naukri() throws InterruptedException {
		
		
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.get("https://www.naukri.com/"); //https://www.amazon.in/
        
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(2000);
        
        driver.close();
    }
    
	@Test()
	public void amazon() throws InterruptedException {
		
		
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.get("https://www.amazon.in/"); 
        Thread.sleep(2000);
        
        driver.quit();
    }
}
