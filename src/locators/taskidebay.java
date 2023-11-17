package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskidebay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.id("gh-ac")).sendKeys("soft toys");
		Thread.sleep(2000);
		driver.findElement(By.id("gh-btn")).click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
