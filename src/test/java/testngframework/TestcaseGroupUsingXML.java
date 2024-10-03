package testngframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestcaseGroupUsingXML{
	
	//Grouping of testcases which we want to execute particularly instead of executing every testcases.
	
	//In XML File
	
	//Groups of testcases which we want to execute particularly instead of running every testcases.
	  
	/* <test>
	    * <groups> 
	    * <run> 
	    * <include name="Raja"/> 
	    * <exclude name="Raja"/> 
	    * </run>
	    * </groups> 
	    * </test>
	  */
	
	// <class name="testngframework.TestcaseGroupUsingXML"/>
	
    @Test(groups="Raja")  
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
	
    @Test 
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
	
    @Test
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
    
    @Test (groups="Raja")  
	public void naukriProfile() throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		
		driver.close();
		
	}
}
