package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	   
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
	    driver.get("https://www.flipkart.com/");
	    
	    List<WebElement> links=driver.findElements(By.tagName("a"));
	    int len=links.size();
	    
	    System.out.println("No of Links in an Flipcart Application is : "+ len);

	    String  DesiredOutput="Flipkart Stories";
	    
	    for(int i=0;i<len;i++) {
	    	
	    	 //System.out.println(i);
	    	 //System.out.println(links.get(i).getAttribute("href"));
	    	
	         if(links.get(i).getText().equals(DesiredOutput)) {
	        	 links.get(i).click();
	         }
	}

}
	
}
