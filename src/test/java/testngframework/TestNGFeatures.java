package testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGFeatures{
	
    @Test (enabled=false)
	public void bookMyShow() throws InterruptedException {
		
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
		driver.get("https://ticketnew.com/movies");
		Thread.sleep(2000);
		
		driver.close();
		
	}
	
    @Test (priority=1)
	public void ajioStore() throws InterruptedException {
		
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		
		driver.close();
	}
	
    @Test (invocationCount=2)
	public void shoppingKart() throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
		driver.get("https://shoppingkartonline.in/");
		Thread.sleep(2000);
		
		driver.close();
	}
    
    @Test //Skip Testcase
	public void naukriProfile() throws InterruptedException {
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		
		driver.close();
		
		throw new SkipException("This Testcase is Skkipped by a Tester");
		
	}
}
