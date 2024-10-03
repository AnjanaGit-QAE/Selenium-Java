package selenium;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class SeleniumSyntaxs {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		// 1.System Set Property
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
         System.setProperty("webdriver.edge.driver", "C:\\\\path\\\\to\\\\edgedriver.exe");
         System.setProperty("webdriver.gecko.driver", "C:\\\\path\\\\to\\\\geckodriver.exe");
         
         
        //2. WebDriver (Interface) implemented with Browser Classes.
         WebDriver driver = new  ChromeDriver();
         WebDriver driver1 = new EdgeDriver();
         WebDriver driver2 = new FirefoxDriver();
         
         driver.get("https://www.ajio.com/");
         driver.navigate().to("https://www.ajio.com/");
         
         // 3. Browser Windows
         driver.manage().window().maximize();
         driver.manage().window().minimize();
         driver.manage().window().fullscreen();
         
         // 4. Implicitly Wait
         driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
         
         // 5. Thread Sleep (class)
         Thread.sleep(5000);
         
         // 6. explicitly Wait --> Using WebDriverWait(class).
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Selenium Webdriver')]")));

 		 
         // 7. List<WebElement>  i.e Interfaces both List and Web Element
 		 List<WebElement> check =  driver.findElements(By.xpath("")); // any identifier
 		 int len= check.size(); 
 		 for(int i=0;i<len;i++) {
 			 check.get(i).getText(); //for traversing in entire list.
 		 }
 		 
 		 // 8.  Handling Alert Pop'us i.e Interface
         Alert alert = driver.switchTo().alert();
         alert.accept();
         alert.dismiss();
         
         // 9. Handling Mouse Actions (class) (Pass WebElement)
         Actions action = new Actions(driver);
         
         action.click().build().perform();
         action.clickAndHold().build().perform(); // click and hold
         action.contextClick().build().perform(); // Right Click
         action.doubleClick().build().perform();  // Double Click
         action.dragAndDrop(null, null).build().perform(); // Drag and Drop
         action.moveToElement(null).build().perform(); // Hover Action
         
         // 10. Keyboard Actions (class);
         Actions action1 = new Actions(driver);
         
         WebElement Username=driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
	     Username.sendKeys("anjuraja1205@gmail.com");
	     
	     Username.sendKeys(Keys.CONTROL+"A");
	     Username.sendKeys(Keys.CONTROL+"C");
	     Username.sendKeys(Keys.TAB);
	     
	     // Multiple Buttons Handling
	     
	     String MultipleButtons = Keys.chord(Keys.SHIFT,Keys.TAB);
	     Username.sendKeys(MultipleButtons);
         
         // 11. Authentication Pop'up
         String UserName = "Anjana";
         String Password = "Anjana@1205";
         String URL = "https://" + UserName +":"+ Password +"@"+"the-internet.herokuapp.com/basic_auth";
         driver.get(URL);
         
         // 12. Frames 
         WebElement Frame = driver.findElement(By.tagName("iframe"));
         driver.switchTo().frame(Frame); // pass WebElement
         
         // 13. Scroll Up and Scroll down  i.e JavascriptExecutor (Interface)
         JavascriptExecutor JE = ((JavascriptExecutor)driver);
         JE.executeScript("window.scrollBy(0,6000)"); //Scrolling Down +ve values
         JE.executeScript("window.scrollBy(0,-60000)");  //Scrolling Up -ve values
         
         WebElement desiredPosition = driver.findElement(By.xpath(""));
 		 JE.executeScript("arguments[0].scrollIntoView(true);", desiredPosition); // Window will be at that desired Position.
 		 
 		 // 14. File(class) i.e Taking Screen Shot is an Interface
 		 File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     Files.copy(f, new File("path\\ of folder\\where you \\wantto \\place\\nameofimage.png || jpg|| jpeg "));
	     
	     // 15. Static Drop Down i.e Select  class, WebElement Interface
	     WebElement dropdown=driver.findElement(By.id("input-option217"));
	     
	     Select s=new Select(dropdown);
	     
	     s.selectByIndex(2);
	     s.selectByValue("3");
	     s.selectByVisibleText("Green\r\n"+"(+$1.20)\r\n"+"");
	     
	     // Printings list of options in a dropdown
	     
	     List<WebElement> opt = s.getOptions();
	     int length=opt.size();
	     
	     for(WebElement i : opt ) {
	    	 System.out.println("Options in an Select Dropdown is :" + i.getText());
	     }
	   
	      
	     // 16. Converting Strings to Integer (Wrapper Class)
	      List<WebElement> L1 = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[5]")); // 1 2 3 4 webelements
	      int len1=L1.size();
	      for(int i=0;i<len;i++) {
			   String  s1 = L1.get(i).getText(); // "1" "2" "3" "4"
		       int a1 = Integer.parseInt(s1); //numbers 1 2 3 4 //wrapper class
	       }
	     
	      String s1="1205";
	      int I = Integer.parseInt(s1);
	      char ch = s1.charAt(0);
	      float f1 = Float.parseFloat(s1);
	      double d = Double.parseDouble(s1);
	      boolean b = Boolean.parseBoolean(s1);
	      
	      int i=1205;
	      String ss = String.valueOf(i);
	      
	      float f2=1205.76f;
	      String s2=String.valueOf(f1);
	      
	      double d1=345.456;
	      String s3=String.valueOf(d1);
	      
	      boolean b1= false;
	      String s4=String.valueOf(b1);
	      
	      char c='A';
	      String s5=String.valueOf(c);
	      
	      
	      // 17. Windows Action
	      driver.navigate().to("https://toolsqa.com/selenium-webdriver/selenium-tutorial/");
	      driver.navigate().refresh();
	      driver.navigate().forward();
	      driver.navigate().back();
	       
	      // 18. Element Displayed method i.e WebElement(Interface)
	      WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Selenium Webdriver')]"));
	      boolean result = text.isDisplayed();
	      boolean result1 = text.isEnabled();
	      boolean result2 = text.isSelected();
	      
	      // 19. Closing Browser
	      driver.close(); // Close Current Window/ tab.
	      driver.quit(); // Close all tabs related to Webdriver
	      
	      // 20. Broken Links or Broken Images
	      
	       String link = null;
		   URL url = new URL(link);// now I have an URl
			
		   HttpURLConnection http = (HttpURLConnection)url.openConnection();// helping us to interact with the server
		   http.setConnectTimeout(5000);// we are waiting to be connected with the server
		   http.connect();// it will connect now successfully 
		   //System.out.println(http.getResponseCode());
		   
		   // 21. Select Class Static Dropdown.
		   WebElement Dropdown = driver.findElement(By.id("input-option217"));
		      
		   Select slt =new Select(Dropdown);
		   slt.selectByIndex(2);
		   Thread.sleep(3000);
		      
		   slt.selectByValue("3");
		   Thread.sleep(3000);
		      
		   s.selectByVisibleText("Green\r\n"+"(+$1.20)\r\n"+"");
		   Thread.sleep(3000);
		   
		   // Printings list og options in a dropdown
		     
		     List<WebElement> opts = s.getOptions();
		     for(WebElement op : opts ) {
		    	 System.out.println("Options in an Select Dropdown is :" + op.getText());
		     }
		     
		     
		     //input[@class="anjana"][contains(text(),' Excellent product! Highly    recommend')]
		     //input[@id="raja"][normalize-space() = 'Excellent product! Highly recommend']
	}

}
