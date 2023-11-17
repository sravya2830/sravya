package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class idlocatorspractice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(10000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dolls");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
