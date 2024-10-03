package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {

	public void Invoke() {
		
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.in"); // "https:\\bigbasket.com"
		driver.get("https:\\bigbasket.com");
		driver.manage().window().maximize();
		driver.close();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InvokeBrowser ib=new InvokeBrowser();
		ib.Invoke();
		
	}

}
