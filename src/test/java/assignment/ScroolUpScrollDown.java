package assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScroolUpScrollDown {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.naukri.com/");
	    
		WebElement element=driver.findElement(By.xpath("//h1[contains(text(),'Find your dream job now')]"));
	    System.out.println(element.getText());
	    Thread.sleep(3000);
	    
	    JavascriptExecutor JE=((JavascriptExecutor)driver);
	    
	    JE.executeScript("window.scrollBy(0,6000)"); //Scroll Down +ve Values.
	    Thread.sleep(3000);
	    
	    JE.executeScript("window.scrollBy(0,-6000)"); // Scrol Up -ve Values.
	    Thread.sleep(3000);
	    
	    //To move  particular place in a window
	    WebElement find=driver.findElement(By.xpath("//h3[contains(text(),'Stand out among recruiters with a video profile')]"));
	    JE.executeScript("arguments[0].scrollIntoView(true);", find);
	    
	    // To take ScrreenSHot of Output
	    //Using File Class
	    
        File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f, new File("C:\\Users\\Anjana Raja\\Documents\\Anjana\\Selenium\\Images\\outputscreen.jpg"));
	    
	    
	   
	    
	}

}
