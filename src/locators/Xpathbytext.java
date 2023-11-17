package locators;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbytext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Daily Deals']")).click();
		 Thread.sleep(2000);
		 
		
		 driver.findElement(By.xpath("//span[text()='Tech']")).click();
		 
		 Thread.sleep(2000);
		 
         driver.close();
	}

}
