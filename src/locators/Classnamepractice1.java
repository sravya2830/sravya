package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classnamepractice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.className("searchformInput")).sendKeys("rakhis");
		Thread.sleep(2000);
		driver.findElement(By.className("searchTextSpan")).click();
		
		Thread.sleep(3000);
		driver.close();
	}

	
}
	