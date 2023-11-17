package interviewpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("searchformInput")).sendKeys("jeans");
		driver.findElement(By.className("searchTextSpan")).click();
		driver.findElement(By.className("product-image")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		

	}

}
