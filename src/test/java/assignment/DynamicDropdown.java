package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
	    driver.get("https://ticketnew.com/movies");
	    
	    WebElement search=driver.findElement(By.xpath("//input[@type='search']"));
	    search.sendKeys("mum");
	    
	    
		/*  Inspecting directly with value
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//div[contains(text(),'Mumbai')]")));
		 * 
		 *  WebElement city=driver.findElement(By.xpath("//div[contains(text(),'Mumbai')]"));
		 * city.click();
		 */
		
	    
	    // Dynamically handling options by using common class name
	    Thread.sleep(2000);
		
	    List<WebElement> lists=driver.findElements(By.className("DesktopMovieCitySelector_searchedArea__bEOHL"));
		int len=lists.size();
		String DesiredCity="Mumbai";
		for(int i=0;i<len;i++) {
			System.out.println(lists.get(i).getText());
			if(lists.get(i).getText().equals(DesiredCity)) {
				lists.get(i).click();
			}
		}
	 
	}

}
