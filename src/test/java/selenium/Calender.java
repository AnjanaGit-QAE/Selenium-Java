package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-calendar")));
		
		String Expectedmonth = "December";
		String Expectedyear = "2030";
		String Expecteddate = "28";
		
		String monthandYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthandYear); // march 2024
		
		String[] monthanddatdearray = monthandYear.split(" ");
		
		
		String month = monthanddatdearray[0];//actual month
		String year = monthanddatdearray[1];// actual year
		System.out.println(month); //march
		System.out.println(year); // 2024
		
		while(!(month.equals(Expectedmonth) && year.equals(Expectedyear)))
		{
			WebElement forwardbutton = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
			forwardbutton.click();
			
			monthandYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(monthandYear);
			
			monthanddatdearray = monthandYear.split(" ");
			
			month = monthanddatdearray[0];//actual month
			year = monthanddatdearray[1];// actual year
			System.out.println(month); //march //December
			System.out.println(year); // 2024 //2030
		}
		
		driver.findElement(By.xpath("//a[contains(text(),'28')]")).click();
		
	}

}
