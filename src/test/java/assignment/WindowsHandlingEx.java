package assignment;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingEx {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/windows");
		
		//String desiredwindowtitle = "New Window";
		//String desiredwindowtitle1 = "New Window1";
		
		String parentwindow = driver.getWindowHandle();
		
		WebElement headerofparentwindow = driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]"));
		
		System.out.println(headerofparentwindow.getText());
		
		
		
		WebElement newwindowlink = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		
		newwindowlink.click();
		
		
		Set<String> S1 = driver.getWindowHandles();
		 
		int len = S1.size();
		
		System.out.println(len);
		
		Iterator<String>  I = S1.iterator();
		
		while(I.hasNext())// 1 2 3 4 5 
		{
			String childwindow = I.next();// 1 2 3 4 5
			
			if(!parentwindow.equals(childwindow))//3
			{
				driver.switchTo().window(childwindow);//3
				
				String title = driver.getTitle();
				
				
				String desiredwindowtitle;
				String desiredwindowtitle1;
				//if(title.equalsIgnoreCase(desiredwindowtitle))
				{
					WebElement newwindowelement = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]"));
					
					System.out.println(newwindowelement.getText());
				
				}
				

				
				
			}
			
			
		}
		//driver.switchTo().defaultContent();
		driver.switchTo().window(parentwindow);
		
		
		
		
		
		
		
	} 
	}


