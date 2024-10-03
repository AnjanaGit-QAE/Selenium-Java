package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSpace {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver(); 
	    driver.manage().window().maximize();
		
	    driver.get("https://www.naukri.com/");
	   
	    WebElement Login = driver.findElement(By.xpath("//a[@title='Jobseeker Login']"));
		Login.click();
		Thread.sleep(2000);
	
	    
	    // Find the WebElement using a CSS selector
	    WebElement usernameElement = driver.findElement(By.xpath("//input[@class='err-border']"));

	    // Retrieve the value of the 'placeholder' attribute
	    String placeholderText = usernameElement.getAttribute("placeholder");

	    // Print the value of the 'placeholder' attribute
	    System.out.println("Placeholder text: " + placeholderText);

	    driver.close();
	}

}
