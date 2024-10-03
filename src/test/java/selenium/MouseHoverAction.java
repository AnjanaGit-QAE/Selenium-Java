package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		
		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	     
		 WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.flipkart.com/");
	     
	     WebElement hover = driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
	     
	     Actions action = new Actions(driver);
	     
	     action.moveToElement(hover).build().perform();
	     
	     
	}

}
