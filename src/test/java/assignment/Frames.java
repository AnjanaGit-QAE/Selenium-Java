package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anjana Raja\\Documents\\eclipse-workspace\\SeleniumProject\\src\\main\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/frames");
		
		WebElement mainwindowelement =driver.findElement(By.className("text-center"));
		System.out.println(mainwindowelement.getText());
		
		WebElement Frame=driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(Frame);
		
		WebElement FrameText =driver.findElement(By.xpath("//h1[@id='sampleHeading'][1]"));
		System.out.println(FrameText.getText());
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		System.out.println(mainwindowelement.getText());
		
		//driver.quit();

	}

}
