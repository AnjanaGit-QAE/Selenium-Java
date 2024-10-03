package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesHandling {

	public static void main(String[] args) {
		
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	   
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		WebElement datathree = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[1]/td[3]"));
        System.out.println(datathree.getText());
		
        int expectedtotal = 10;
		int actualtotal = 0;
		
		List<WebElement> L1 = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[5]")); // 1 2 3 4 webelements
		int len = L1.size();
		
		for(int i=0; i<len; i++) // 1 2 3 4 
		{
			String s1 = L1.get(i).getText(); // "1" "2" "3" "4"
			int a1 = Integer.parseInt(s1); //numbers 1 2 3 4 
			
			actualtotal = actualtotal + a1;
			
			
		}
		
		System.out.println(actualtotal);
		
		if (actualtotal == expectedtotal)
		{
			System.out.println("Yes!! Both the totals are Equal");
		}
		
	}

}
