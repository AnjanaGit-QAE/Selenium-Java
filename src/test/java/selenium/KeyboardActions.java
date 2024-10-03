package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		

		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	     
		 WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.naukri.com/");
	     
	     Actions action = new Actions(driver);
	     
	     WebElement link = driver.findElement(By.linkText("Login"));
	     link.click();
	     Thread.sleep(2000);
	     
	     WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
	     Username.sendKeys("anjuraja1205@gmail.com");
	     
         Username.sendKeys(Keys.CONTROL +"A");
	     Thread.sleep(2000);
	     
         Username.sendKeys(Keys.CONTROL +"C");
	     Thread.sleep(2000);
	     
	     Username.sendKeys(Keys.TAB);
	     Thread.sleep(2000);
	     
	     WebElement Password=driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
	     Password.sendKeys("Anjana@12051999");
	     
	     WebElement Show=driver.findElement(By.xpath("//small[contains(text(),'Show')]"));
	     Show.click();
	     Thread.sleep(2000);
	     
	     WebElement Hide=driver.findElement(By.xpath("//small[contains(text(),'Hide')]"));
	     Hide.click();
	     Thread.sleep(2000);
	     
	     Password.sendKeys(Keys.TAB);
	     Thread.sleep(2000);
	     
	     WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
	     button.click();
	     Thread.sleep(3000);
	     
	     driver.close();
	     
	}

}

// Multiple Buttons Handling

// String MultipleButtons = Keys.chord(Keys.SHIFT,Keys.TAB);
// Username.sendKeys(MultipleButtons);
