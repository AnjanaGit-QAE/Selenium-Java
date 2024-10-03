package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	   
	    driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	    
	    String parent = driver.getWindowHandle();
	    System.out.println("Parent id is : "+ parent);
	    
	    System.out.println("Parent Window title is : " + driver.getTitle());
	    
	    WebElement Button = driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
	    Button.click();
	    
	    Set<String> allWindows = driver.getWindowHandles();
	    int len = allWindows.size();
	    System.out.println("Total no-of Windows is : " + len);
	    
	    for(String child : allWindows)
	    {
	    	if(!parent.equalsIgnoreCase(child)) {
	    		
	    		driver.switchTo().window(child);
	    		driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys("Anjana Sharanya");
	    		
	    		Thread.sleep(3000);
	    		driver.close();
	    	}
	    }
       
	    driver.switchTo().window(parent);
	    System.out.println("Parent Window tile is : " + driver.getTitle());
	    Thread.sleep(4000);
	    
	    driver.close();
	}

}
