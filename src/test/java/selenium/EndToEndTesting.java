package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().deleteAllCookies();
		
		// login page
		
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		driver.findElement(By.xpath("//span[contains(text(),'My Account')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		
		
		driver.findElement(By.id("input-email")).sendKeys("rajaanjanasharanya1205@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Anjana@12051999");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		
		//adding cart page
		
		driver.findElement(By.xpath("//img[@title='naveenopencart']")).click();
		
		
		
		List<WebElement> products = driver.findElements(By.xpath("//div[@class='product-layout col-lg-3 col-md-3 col-sm-6 col-xs-12']/div/div/h4/a"));
		
		int length = products.size();
		
		System.out.println(length);
		
		String p1 = "MacBook";
		
	
		
		for(int i=0; i<length; i++) {
			
			
			if(products.get(i).getText().equals(p1))
			{
			
			System.out.println(products.get(i).getText());
			
			List<WebElement> cartbuttons = driver.findElements(By.xpath("//div[@class='product-layout col-lg-3 col-md-3 col-sm-6 col-xs-12']/div/div/button/span"));
			
			cartbuttons.get(i).click();
			
			if(products.get(i).getText().equals(p1))
			{
				cartbuttons.get(i).click();
				cartbuttons.get(i).click();
				break;
			}
			

			Thread.sleep(5000);
			Assert.assertTrue(driver.findElement(By.className("alert-success")).getText() .contains(products.get(i).getText()), "Order text is not available!!");
			Thread.sleep(5000);
				
			
		}
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='cart']")).click();
		
		Thread.sleep(3000);
		
		
		  List<WebElement> prices = driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[2]"));
		  
		  Thread.sleep(3000);
		  
		  int len1 = prices.size();
		  
		  System.out.println(len1);
		  
		  String e = driver.findElement(By.xpath("//table[@class='table table-bordered']/tbody/tr[2]/td[2]")).getText();
		  
		  String e1 = e.replace("$", "").replace(",", "");
		  
		  double total = Double.parseDouble(e1);
		  
		  
		  
		  System.out.println(total);
		  
		  
		  double sum = 0;
		  
		  for(int j= 0; j<prices.size()-1; j++) {
		  
			  String x1 = prices.get(j).getText();
			  
			  String x2 = x1.replace("$", "").replace(",", "");
			  
			  double productamount = Double.parseDouble(x2);
		  
		  sum += productamount;
		  
		  }
		  
		  System.out.println(sum);
		  
		  Assert.assertEquals(sum, total, "Both are not equal");
		 
		
		driver.findElement(By.xpath("//a[@href = 'https://naveenautomationlabs.com/opencart/index.php?route=checkout/cart']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='pull-right']")).click();
		
		Thread.sleep(2000);
		
		// checkout page
		
		driver.findElement(By.xpath("//input[@value='new']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		Thread.sleep(2000);

		
		driver.findElement(By.id("input-payment-firstname")).sendKeys("Raja");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("input-payment-lastname")).sendKeys("S");
		
		Thread.sleep(2000);
		
		//driver.findelement(by.id("input-payment-email")).sendkeys("raja@123.com");
		
		//Thread.sleep(2000);
		
		//driver.findElement(By.id("input-payment-telephone")).sendKeys("1234567890");
		
		//Thread.sleep(2000);

		
		driver.findElement(By.id("input-payment-address-1")).sendKeys("1st main");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("input-payment-city")).sendKeys("Bangalore");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("input-payment-postcode")).sendKeys("560066");
		
		Thread.sleep(2000);
	
		
		Select s = new Select(driver.findElement(By.name("country_id")));
		
		s.selectByVisibleText("India");
		Thread.sleep(5000);
		
		Select s1 = new Select(driver.findElement(By.name("zone_id")));
		
		s1.selectByVisibleText("Karnataka");
		Thread.sleep(5000);
		
		driver.findElement(By.id("button-payment-address")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.name("comment")).sendKeys("Test Purchase");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		Thread.sleep(3000);
		
		
		driver.close();	

	}

}
