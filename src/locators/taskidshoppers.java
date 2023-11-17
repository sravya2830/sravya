package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskidshoppers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shoppersstack.com/");
		
		Thread.sleep(10000);
		driver.findElement(By.name("loginBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("pavan@korepu");
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("12345678");
		Thread.sleep(1000);
		driver.findElement(By.className("MuiButton-label")).click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
