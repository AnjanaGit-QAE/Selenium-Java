package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/iframe"); 
		
	    WebElement mainwindowwelement1 = driver.findElement(By.linkText("Elemental Selenium"));			
		System.out.println(mainwindowwelement1.getText());
        Thread.sleep(3000);
        
        WebElement Frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(Frame);
        
        WebElement bodyplace = driver.findElement(By.id("tinymce"));
        bodyplace.clear();
        
        bodyplace.sendKeys("This is the frame and I am writing Here");
        Thread.sleep(3000);
        
        driver.switchTo().defaultContent();  //returning back to main page
        
        System.out.println(mainwindowwelement1.getText());

		driver.close();
	}

}
