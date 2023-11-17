package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class namelocatorprac1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		 driver.findElement(By.name("username")).sendKeys("sravyagoudburra");
		 Thread.sleep(2000);
		 driver.findElement(By.name("password")).sendKeys("Sailugoud2830");
		 Thread.sleep(2000);
		 driver.close();
		 
		 

	}

}
