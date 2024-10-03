package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	    
		 WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://the-internet.herokuapp.com/");
	     
	     WebElement link = driver.findElement(By.linkText("Drag and Drop"));
	     link.click();
	     
	     WebElement element1 = driver.findElement(By.id("column-a"));
	     WebElement element2 = driver.findElement(By.id("column-b"));
	     
	     Actions action=new Actions(driver);
	     
	     action.clickAndHold(element1).build().perform();
	     Thread.sleep(5000);
	     
	     action.dragAndDrop(element1, element2).build().perform();
	     Thread.sleep(5000);
	     
	     //action.clickAndHold(element1).release(element2).perform();
	     
	    //action.moveToElement(element1).clickAndHold().moveToElement(element2).release().perform();
	     
	     
	     
	}

}
