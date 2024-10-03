package assignment;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");  
		
		List<WebElement> Images= driver.findElements(By.tagName("img"));
		int len=Images.size();
		System.out.println("Total No-of Images in a given Website is : "+ len);
		
		for (int i=0;i<len;i++) {
			String ImageUrlFromWebsite=Images.get(i).getAttribute("src");
			//System.out.println(UrlFromWebsite);
			BrokenImages.validation(ImageUrlFromWebsite);
		}
	}
	
		public static void validation(String Image) throws Exception {
			try { 
				
			URL url = new URL(Image);
			HttpURLConnection http = (HttpURLConnection)url.openConnection();
			http.setConnectTimeout(5000);
			http.connect();
			
			if(http.getResponseCode() >= 400) {
				   System.out.println(Image +" "+ "-->" + http.getResponseMessage()+" "+ "-->" + "is  a Broken Image.");
	         	}

		   else {
				  System.out.println(Image +" "+ "-->" + http.getResponseMessage()+" "+ "-->" + "is  not a Broken Image."); 
				} 
				 
		}
			
			catch (Exception e) {
				System.out.println(e);
			}
		
	}

}
