package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) throws InterruptedException {
		//label[text()='Email']/following-sibling::input[@type='text']
		
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
		// following-sibling
		WebElement Email = driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']"));
		Email.sendKeys("anjuraja1205@gmail.com");
		
		Thread.sleep(3000);
		
		//preceding-sibling
		WebElement Checkbox = driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td//child::input"));
		Checkbox.click();
		
		Thread.sleep(3000);
		
		WebElement Register = driver.findElement(By.xpath("//div[@class='container']/descendant::button[1]"));
		Register.click();
		
		Thread.sleep(3000);
		
		//td[text()='3000']/preceding-sibling::td/child::input
		WebElement Checkbox3 = driver.findElement(By.xpath("//td[text()='3000']/preceding-sibling::td/child::input"));
		Checkbox3.click();
		
		Thread.sleep(3000);
		
		//button[@class='btn']/parent::div
		WebElement Clear = driver.findElement(By.xpath("//button[@class='btn']/parent::div"));
		Clear.click();
		
		Thread.sleep(3000);
		
		//td[text()='Maria Anders']/following-sibling::td[1]
		WebElement text = driver.findElement(By.xpath("//td[text()='Maria Anders']/following-sibling::td[1]"));
		System.out.println(" Text is : "+ text.getText());
		
		Thread.sleep(3000);
		
		//div[@class='container']/child::input[2]
		WebElement Lastname = driver.findElement(By.xpath("//div[@class='container']/child::input[2]"));
		Lastname.sendKeys("Raja");
		
		Thread.sleep(3000);
		
		//th[text()='Contact']/ancestor::table
		WebElement Ancestor = driver.findElement(By.xpath("//th[text()='Contact']/ancestor::table"));
		
		//div[@class='container']/descendant::input[4]
		WebElement Password = driver.findElement(By.xpath("//div[@class='container']/descendant::input[4]"));
		Password.sendKeys("Anjana2120519999");
		
		Thread.sleep(3000);
		
		//input[@type='text'][1]/ancestor::form/child::div[@class='container']
		WebElement Firstname = driver.findElement(By.xpath("//input[@fdprocessedid='iefj0a']/ancestor::form/child::div[1]"));
		Firstname.sendKeys("Anjana Sharanya");
		
		Thread.sleep(3000);
			
		driver.close();
	}

}

// following-ibling
//label[text()='Email']/following-sibling::input[@type='text']   {{OR}} By Using Index starts from 1,2,3....
//label[text()='Email']/following-sibling::input[1]

// parent
//label[text()='Email']/following-sibling::input[1]//parent::div
//label[text()='Email']/following-sibling::input[1]/parent::div  {{i.e we can use single or double slash}}

// Child
//div[@class='container']/child::input[@type='text'][3]
//div[@class='container']/child::input[3]

// preceding-sibling
//td[text()='Maria Anders']/preceding-sibling::td//child::input
//td[text()='Maria Anders']/preceding-sibling::td//input[@type='checkbox']
//td[text()='Maria Anders']/preceding-sibling::td//input[1]
//td[text()='Maria Anders']/preceding-sibling::td//input  {{ i.e if it is on;y one input tag np need of mentioning index and attributes}}


// descendant
//div[@class='container']/descendant::button[1]

// descendant-or self
//div[@class='container']/descendant-or self::button[1]

// ancestor
//button[@class='btn']/ancestor::div
//button[@class='btn']/ancestor::div[1]

// ancestor-or-self
//button[@class='btn']/ancestor-or-self::div
//button[@class='btn']/ancestor-or-self::div[1]
