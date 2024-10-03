package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicCheckboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.get("https://naveenautomationlabs.com/opencart/");
        driver.manage().window().maximize();
        
        WebElement link=driver.findElement(By.linkText("Apple Cinema 30\""));
        link.click();
        String DesiredOutput="10";
        List<WebElement> check = driver.findElements(By.xpath("//input[@type='checkbox']//parent::label"));
        int len=check.size();
        for(int i=0;i<len;i++) {
        	System.out.println(check.get(i).getText());
        	if(check.get(i).getText().equals(DesiredOutput)) {  //split process need to confirm with bro
        		check.get(i).click(); 
        	}
        }
	}

}
