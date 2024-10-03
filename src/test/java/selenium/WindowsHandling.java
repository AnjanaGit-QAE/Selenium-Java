package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	   
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    driver.get("https://www.chexsystems.com/");
	    
	    String ParentWindow = driver.getWindowHandle();
	   
	    String PWTitle = driver.getTitle();
	    System.out.println("Prent Window Title is : " +PWTitle);
	    
	    WebElement Element= driver.findElement(By.xpath("//h2[contains(text(),'Requesting Reports')]"));
	    System.out.println(Element.getText());
	    
	    WebElement Login=driver.findElement(By.linkText("Login"));
	    Login.click();
	    
	    Set<String> S1 = driver.getWindowHandles();
	    int len=S1.size();
	    System.out.println("Length of Total Windows (including ParentWindow) will display : " +len);
	    
	    Iterator<String>  I = S1.iterator();
	    
	    while(I.hasNext()) {
	    	
	    	String ChildWindow = I.next();
		  
	    	if(!(ParentWindow.equals(ChildWindow))) {
	    		
	    		driver.switchTo().window(ChildWindow);
	    		String Title = driver.getTitle();
	    		System.out.println("Child Window Title is : " + Title);
                Thread.sleep(8000);
                
	    		WebElement Value = driver.findElement(By.xpath("//input[@name='loginName']"));
	    		Value.sendKeys("Anjana Raja");
	    		
	    		WebElement Proceed = driver.findElement(By.xpath("//span[contains(text(),'Proceed')]"));
	    		Proceed.click();
	    		
	    		Thread.sleep(5000);
	    		
	    		WebElement Cancel = driver.findElement(By.xpath("//span[contains(text(),' Cancel ')]"));
	    		Cancel.click();
	    		
	    		Alert A=driver.switchTo().alert();
	    		A.accept();
	    		
	    		Thread.sleep(3000);
	    		driver.close();

	    	}
	    	
	    	//driver.switchTo().defaultContent();
	    	driver.switchTo().window(ParentWindow);
	    	Thread.sleep(3000);
	    	
	     
	   }
	    
	   driver.close();

    }

}
