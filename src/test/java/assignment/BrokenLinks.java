package assignment;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://in.bookmyshow.com/explore/home/bengaluru");  
		
		List<WebElement> Links= driver.findElements(By.tagName("a"));
		int len=Links.size();
		System.out.println("Total No-of Links in a given Website is : "+ len);
		
		for (int i=0;i<len;i++) {
			
			String UrlFromWebsite=Links.get(i).getAttribute("href");
			//System.out.println(UrlFromWebsite);
			BrokenLinks.validation(UrlFromWebsite);
			
		}
	}
	
		public static void validation(String link) throws Exception {
			try { 
				
			URL url = new URL(link);
			HttpURLConnection http = (HttpURLConnection)url.openConnection();
			http.setConnectTimeout(5000);
			http.connect();
			
			if(http.getResponseCode() <= 200) {
				   System.out.println(link + "-->" + http.getResponseMessage()+ "-->" + "is  not a Broken Link.");
	         	}

				  /*else {
					     System.out.println(link + "-->" + http.getResponseMessage()+ "-->" +
				   "is not a Broken Link."); } */
				 
		}
			
			catch (Exception e) {
				System.out.println(e);
			}
		
	}

}
