package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idlocatorpractice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("sravya");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("sravya2830");
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
