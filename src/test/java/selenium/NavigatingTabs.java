package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingTabs {

    public static void main(String[] args) throws InterruptedException {
        
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html?m=1");
        
        // Get the current window handle (parent window)
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window ID: " + parentWindow);
        
        // Click on the first link
        driver.findElement(By.xpath("//div[@class='post-body entry-content']/child::a[1]")).click();
        Thread.sleep(2000); // Wait for the new tab to open
        
        // Click on the second link
        driver.findElement(By.xpath("//div[@class='post-body entry-content']/child::a[2]")).click();
        Thread.sleep(2000); // Wait for the new window/tab to open
        
        // Click on the third link
        driver.findElement(By.xpath("//div[@class='post-body entry-content']/child::a[3]")).click();
        Thread.sleep(20000); // Wait for the new window/tab to open
        
        // Get all the window handles after clicking the links
        Set<String> allWindowHandles = driver.getWindowHandles();
        
        // Convert Set to List for easier access to window handles
        List<String> windowList = new ArrayList<String>(allWindowHandles);
        
        // Switch to the first child window and perform actions
        driver.switchTo().window(windowList.get(1));
        System.out.println("Title of first child window: " + driver.getTitle());
       
        WebElement Email = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
        Email.sendKeys("anjuraja1205@gmail.com");
        
        Thread.sleep(3000);
        driver.close();
        
        // Switch to the second child window and perform actions
        driver.switchTo().window(windowList.get(2));
        System.out.println("Title of second child window: " + driver.getTitle());
        
        WebElement yahooSearch = driver.findElement(By.name("p"));
        yahooSearch.sendKeys("Selenium");
        
        Thread.sleep(3000); 
        driver.close();
        
        // Switch to the third child window and perform actions
        driver.switchTo().window(windowList.get(3));
        System.out.println("Title of third child window: " + driver.getTitle());
       
        WebElement Search = driver.findElement(By.name("q"));
        Search.sendKeys("Selenium Webdriver");
       
        Thread.sleep(3000);
        driver.close(); 
        
        // Switch back to the parent window
        driver.switchTo().window(parentWindow);
        System.out.println("Back to parent window title is : " + driver.getTitle());
        
        
        
        driver.quit();
    }
}


