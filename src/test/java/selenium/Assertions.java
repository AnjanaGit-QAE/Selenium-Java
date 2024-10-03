package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
       
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        driver.get("https://www.naukri.com/");
        
        boolean ExpectedResult= true;
        
        WebElement Register = driver.findElement(By.id("register_Layer"));
        boolean Result = Register.isDisplayed(); // true
        
        // Two types of Assertions.
        
        // 1. Hard Assert or Assert
        // *** Display Message in Console Window and If Assert(Hard) got fail.It will Stop Execution.
        //It won't proceed with Next steps of Execution Testcase Will fail.
        
        //Syntax
        //Assertion Assert= new Assertion(); // (Syntax) This is not Mandatory Step.
        //Assert.assertTrue(Result == ExpectedResult, "The Element is Visible");
        
        //2. Soft Assert or Verify
        //If Assert got fail also. It won't Stop Execution It will proceed with Next steps.
        
        SoftAssert SA =new SoftAssert(); 
        SA.assertTrue(Result == ExpectedResult, "The Element is Visible");
        
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(2000);
        
        WebElement Username = driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']"));
        Username.sendKeys("anjuraja1205@gmail.com");
        
        WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
        Password.sendKeys("Anjana@12051999");
        
        Thread.sleep(2000);
        driver.quit();
        
        SA.assertAll(); // For Soft Assert for Displaying Message  in Console Window, we need to use "assert.All()" method and If Assert got fail also. It won't Stop Execution It will proceed with Next steps.
                        // Advantage is Even if Assert failed also It is proceeding with Next Steps but Testcase will fail. As it is Error in Code so, the Testcase will fail.
       
	}
}
