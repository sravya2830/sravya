package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorflipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button._2KpZ6l")).click();
		 Thread.sleep(2000);
		driver.findElement(By.cssSelector("input._3704LK")).sendKeys("mobiles");
		 Thread.sleep(2000);
		
		 driver.findElement(By.cssSelector("path._34RNph")).click();
		 Thread.sleep(3000);
		 driver.close();
		 
	}

}
