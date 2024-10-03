package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/");
        driver.manage().window().maximize();
        WebElement link=driver.findElement(By.linkText("My Account"));
        link.click();
        WebElement link1=driver.findElement(By.linkText("Register"));
        link1.click();
        String desiredOutput="Yes";
        List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']//parent::label"));
        int len=radio.size();
        for(int i=0;i<len;i++) {
        	System.out.println(radio.get(i).getText());
        	if(radio.get(i).getText().equals(desiredOutput)) {
        		radio.get(i).click();
        	}
        }
        
	}

}
