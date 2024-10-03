package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
	
		
     //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
   
	 WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");  
     
     WebElement rightclickele = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
     
     Actions action = new Actions(driver);
     
     //action.contextClick(rightclickele).build().perform();  //rightclick action perform
     
     WebElement Doubleclickele=driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
     
     action.doubleClick(Doubleclickele).build().perform();   //doubleclick action perform
     
     driver.close();
     
	}

}
