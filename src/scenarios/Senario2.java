package scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Senario2 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./jars/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Implicit Wait
		
		WebElement id = driver.findElement(By.id("identifierId"));
		id.sendKeys("joeychan1504@gmail.com");
		WebElement clickId = driver.findElement(By.id("identifierNext"));
		clickId.click();
		
		driver.findElement(By.name("password")).sendKeys("monika1355111");// constructor chaining
		driver.findElement(By.id("passwordNext")).click();
		
		WebDriverWait ww=new WebDriverWait(driver , 10);
		if(ww.until(ExpectedConditions.titleContains("Inbox"))) {
			System.out.println("Successfully Logged In using Username and Password");
		}
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("joeychan1504@gmail.com");
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("hello");
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("this is kavya");
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
	}	
}

