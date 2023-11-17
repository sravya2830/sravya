package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathnetflix {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-uia='header-login-link']")).click();
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-uia='login-field']")).sendKeys("sravya");
		 
		
		 driver.findElement(By.xpath("//input[@data-uia='password-field']")).sendKeys("6281580287");
		 
		 driver.findElement(By.xpath("//button[@data-uia='login-submit-button']")).click();
         Thread.sleep(3000);
         driver.close();
	}

}
