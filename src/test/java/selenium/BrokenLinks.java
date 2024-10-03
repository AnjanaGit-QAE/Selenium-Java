package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
	    
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.ajio.com/");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		int len = list.size();
		System.out.println(" Total number of Links in the Application is " + len);
		
		for (int i =0;i<len;i++)
		{
			String urlfromwebsite = list.get(i).getAttribute("href");
			//System.out.println(urlfromwebsite);
			BrokenLinks.validatation(urlfromwebsite);
		}
		
	}
		
		public static void validatation(String link) {
		
		try {
	
		URL url = new URL(link);// now I have an URl
		
		HttpURLConnection http = (HttpURLConnection)url.openConnection();// helping us to interact with the server
		http.setConnectTimeout(5000);// we are waiting to be connected with the server
		http.connect();// it will connect now successfully 
		//System.out.println(http.getResponseCode());
		
		if(http.getResponseCode()>=400) { //getResponseCOde method will give the response code based url we used
			 System.out.println(link + "-->" + http.getResponseMessage()+ " is a broken Link");
		}

		
	    else {
	    	  System.out.println(link + "-->" + http.getResponseMessage()+ " is not a Broken Link") ; 
            }
 
		}
		
		
		catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
